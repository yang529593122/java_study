package relyon;

public class Test {
    public static void main(String[] args) {
        // 创建一个农夫
        Farmer farmer = new Farmer();
        // 农夫养猪
        Pig pig = farmer.breeding(5);
        // 创建屠夫
        Person person = new Person("屠夫");
        // 屠夫杀猪
        person.killPig(pig);
    }
}
