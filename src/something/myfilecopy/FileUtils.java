package something.myfilecopy;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


public class FileUtils {
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = ONE_KB * ONE_KB;
    private static final long FILE_COPY_BUFFER_SIZE = ONE_MB * 30;
    public static void copyDirectory(final File srcDir, final File destDir) throws IOException {
        copyDirectory(srcDir, destDir, true);
    }

    public static void copyDirectory(final File srcDir, final File destDir,
                                     final boolean preserveFileDate) throws IOException {
        copyDirectory(srcDir, destDir, null, preserveFileDate);
    }
    public static void copyDirectory(final File srcDir, final File destDir,
                                     final FileFilter filter, final boolean preserveFileDate) throws IOException {
        checkFileRequirements(srcDir, destDir);
        if (!srcDir.isDirectory()) {
            throw new IOException("资源 '" + srcDir + "' 存在但不是目录");
        }
        if (srcDir.getCanonicalPath().equals(destDir.getCanonicalPath())) {
            throw new IOException("Source '" + srcDir + "' and destination '" + destDir + "' 目录相同");
        }

        // Cater for destination being directory within the source directory (see IO-141)
        List<String> exclusionList = null;
        if (destDir.getCanonicalPath().startsWith(srcDir.getCanonicalPath())) {
            final File[] srcFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
            if (srcFiles != null && srcFiles.length > 0) {
                exclusionList = new ArrayList<>(srcFiles.length);
                for (final File srcFile : srcFiles) {
                    final File copiedFile = new File(destDir, srcFile.getName());
                    exclusionList.add(copiedFile.getCanonicalPath());
                }
            }
        }
        doCopyDirectory(srcDir, destDir, filter, preserveFileDate, exclusionList);
    }
/*
*检测资源有效性
*/
    private static void checkFileRequirements(final File src, final File dest) throws FileNotFoundException {
        if (src == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (dest == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!src.exists()) {
            throw new FileNotFoundException("Source '" + src + "' does not exist");
        }
    }







    private static void doCopyDirectory(final File srcDir, final File destDir, final FileFilter filter,
                                        final boolean preserveFileDate, final List<String> exclusionList)
            throws IOException {
        // recurse
        final File[] srcFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
        if (srcFiles == null) {  // null if abstract pathname does not denote a directory, or if an I/O error occurs
            throw new IOException("Failed to list contents of " + srcDir);
        }
        if (destDir.exists()) {
            if (destDir.isDirectory() == false) {
                throw new IOException("Destination '" + destDir + "' exists but is not a directory");
            }
        } else {
            if (!destDir.mkdirs() && !destDir.isDirectory()) {
                throw new IOException("Destination '" + destDir + "' directory cannot be created");
            }
        }
        if (destDir.canWrite() == false) {
            throw new IOException("Destination '" + destDir + "' cannot be written to");
        }
        for (final File srcFile : srcFiles) {
            final File dstFile = new File(destDir, srcFile.getName());
            if (exclusionList == null || !exclusionList.contains(srcFile.getCanonicalPath())) {
                if (srcFile.isDirectory()) {
                    doCopyDirectory(srcFile, dstFile, filter, preserveFileDate, exclusionList);
                } else {
                    DoCopyCallableThread doCopyCallableThread =
                            new DoCopyCallableThread(srcFile, dstFile, preserveFileDate);
                    doCopyCallableThread.doCopyThread();
                    //doCopyFile(srcFile, dstFile, preserveFileDate);
                }
            }
        }

        // Do this last, as the above has probably affected directory metadata
        if (preserveFileDate) {
            destDir.setLastModified(srcDir.lastModified());
        }
    }









    private static  void  doCopyFile(final File srcFile, final File destFile, final boolean preserveFileDate)
            throws IOException {
        if (destFile.exists() && destFile.isDirectory()) {
            throw new IOException("Destination '" + destFile + "' exists but is a directory");
        }

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileChannel input = fis.getChannel();
             FileOutputStream fos = new FileOutputStream(destFile);
             FileChannel output = fos.getChannel()) {
            final long size = input.size(); // TODO See IO-386
            long pos = 0;
            long count = 0;

            while (pos < size) {

                final long remain = size - pos;
                count = remain > FILE_COPY_BUFFER_SIZE ? FILE_COPY_BUFFER_SIZE : remain;//传输缓冲大小为30MB
                final long bytesCopied = output.transferFrom(input, pos, count);
                if (bytesCopied == 0) { // IO-385 - can happen if file is truncated after caching the size
                    break; // ensure we don't loop forever
                }
                pos += bytesCopied;
                System.out.println(pos);


            }
        }

        final long srcLen = srcFile.length(); // TODO See IO-386
        final long dstLen = destFile.length(); // TODO See IO-386
        if (srcLen != dstLen) {
            throw new IOException("文件 '" +
                    srcFile + "' 和文件 '" + destFile + "' Expected length: " + srcLen + " Actual: " + dstLen);
        }
        if (preserveFileDate) {
            destFile.setLastModified(srcFile.lastModified());
        }
    }
}




 class DoCopyCallableThread {
     private File srcFile ;
     private File destFile;
     private boolean preserveFileDate;

     public DoCopyCallableThread(File srcFile, File destFile, boolean preserveFileDate) {
         this.srcFile = srcFile;
         this.destFile = destFile;
         this.preserveFileDate = preserveFileDate;
     }

     public   void  doCopyThread(){
        // 1.创建线程执行复制文件的任务对象。
         DoCopyCallable call = new DoCopyCallable(srcFile, destFile, preserveFileDate);
        FutureTask<Boolean> task = new FutureTask<>(call);
        // 3.把未来任务对象（Runnable对象）包装成一个线程对象
        Thread t = new Thread(task);
        t.start();
         System.out.println(t.getName());
        // 获取线程的执行结果：正常结果。异常结果。
         Boolean rs=false;
        try {
             rs  = task.get();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
 }




// 泛型是线程任务最终执行的结果数据类型。
class DoCopyCallable implements Callable<Boolean> {
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = ONE_KB * ONE_KB;
    private static final long FILE_COPY_BUFFER_SIZE = ONE_MB * 30;
    private File srcFile;
    private File destFile;
    private boolean preserveFileDate;

    public DoCopyCallable(File srcFile, File destFile, boolean preserveFileDate) {
        this.srcFile = srcFile;
        this.destFile = destFile;
        this.preserveFileDate = preserveFileDate;
    }

    @Override
    public Boolean call() throws Exception {
        if (destFile.exists() && destFile.isDirectory()) {
            throw new IOException("Destination '" + destFile + "' exists but is a directory");
        }

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileChannel input = fis.getChannel();
             FileOutputStream fos = new FileOutputStream(destFile);
             FileChannel output = fos.getChannel()) {
            final long size = input.size(); // TODO See IO-386
            long pos = 0;
            long count = 0;

            while (pos < size) {

                final long remain = size - pos;
                count = remain > FILE_COPY_BUFFER_SIZE ? FILE_COPY_BUFFER_SIZE : remain;//传输缓冲大小为30MB
                final long bytesCopied = output.transferFrom(input, pos, count);
                if (bytesCopied == 0) { // IO-385 - can happen if file is truncated after caching the size
                    break; // ensure we don't loop forever
                }
                pos += bytesCopied;
                System.out.println(pos);


            }
        }

        final long srcLen = srcFile.length(); // TODO See IO-386
        final long dstLen = destFile.length(); // TODO See IO-386
        if (srcLen != dstLen) {
            throw new IOException("文件 '" +
                    srcFile + "' 和文件 '" + destFile + "' Expected length: " + srcLen + " Actual: " + dstLen);
        }
        if (preserveFileDate) {
            destFile.setLastModified(srcFile.lastModified());
        }

        return true;
    }
}