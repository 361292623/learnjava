package 作业.训练10;

public class Test9 {
    public static void main(String[] args) {
        Person person = new Person(null,null);
        Thread thread1 = new Thread(new Runnable() {

            @Override

            public void run() {
                while (true){
                    person.setName("易燃");
                    person.setSex("女");
                    this.notifyAll();
                    try {

                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        });



        Thread thread2 = new Thread(new Runnable() {

            @Override

            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (true){
                    System.out.println(person.getName()+"--"+person.getSex());
                    person.setName(null);
                    person.setSex(null);
                    this.notifyAll();
                    try {

                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        });


        thread1.start();
        thread2.start();
    }
}
 class personRunnable implements Runnable{
     @Override
     public void run() {

     }
 }