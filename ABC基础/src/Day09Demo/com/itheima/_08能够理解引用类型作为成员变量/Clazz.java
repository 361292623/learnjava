package Day09Demo.com.itheima._08能够理解引用类型作为成员变量;

public class Clazz {
    private int code ;
    private String name ;
    private int stusNums ;

    public Clazz() {
    }

    public Clazz(int code, String name, int stusNums) {
        this.code = code;
        this.name = name;
        this.stusNums = stusNums;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStusNums() {
        return stusNums;
    }

    public void setStusNums(int stusNums) {
        this.stusNums = stusNums;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", stusNums=" + stusNums +
                '}';
    }
}
