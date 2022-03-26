package relyon;

public class Person {
    // 属性
    public String name;
    // 构造
    public Person(){}
    public Person(String name){
        this.name = name;
    }
    // 方法
    public void killPig(Pig pig){
        String pigName = pig.getName();
        int pigWeight = pig.getWeightNum();
        System.out.println(pigName + "的体重"+pigWeight);
        pig.killed();
    }
}
