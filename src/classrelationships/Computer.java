package classrelationships;

public class Computer {
    private int number; // 电脑编号
    private Boolean status = false;  // 电脑状态  true 开 false 关

    // 构造函数
    public Computer() {
    }

    public Computer(int number) {
        this.number = number;
    }

    // 方法
    public boolean getStatus() {
        return this.status;
    }

    public int getNumber() {
        return this.number;
    }

    public void open() {
        this.status = true;
        System.out.println(this.number + "号打开啦！");
    }

    public void using() {
        System.out.println(this.number + "号使用中！");
    }

    public void close() {
        this.status = false;
        System.out.println(this.number + "号关闭啦！");
    }
}
