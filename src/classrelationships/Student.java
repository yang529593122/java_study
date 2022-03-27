package classrelationships;

public class Student {
    private String name;
    private int RP = (int) (Math.random() * 10);

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    // 方法
    public void useComouter(Computer computer) {
        computer.open();
        computer.using();
        if (this.RP < 5) {
            computer.close();
        } else {
            System.out.println(this.name + "没有关电脑！");
        }
    }

    public String getName() {
        return this.name;
    }
}
