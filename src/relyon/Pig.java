package relyon;

public class Pig {
    // 属性
    private String name; // 名字
    private int weight = 20; // 重量

    // 构造
    public Pig() {
    }

    public Pig(String name) {
        this.name = name;
    }

    // 方法
    public void killed() {
        System.out.println(this.name + "被杀啦！");
    }

    public void growUp(int month) {
        for (int i = 1; i < month; i++) {
            this.weight *= 2;
        }
    }

    public int getWeightNum() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
