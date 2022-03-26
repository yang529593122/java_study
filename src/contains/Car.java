package contains;

public class Car {
    // 属性
    public String brand; // 品牌
    public String type; // 型号
    public String color; // 颜色
    public Wheel wheel; // 车有个轮子
    public Car(){}
    public Car(String brand,String type,String color,Wheel wheel){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.wheel = wheel;
    }
    // 方法
    public void showCar(){
        System.out.println("这是一辆"+brand + "的"+ type+"型号" + color+ "的小汽车");
        System.out.println("车上安装着"+wheel.brand+"品牌的"+wheel.size+"尺寸"+wheel.color + "颜色的轮子");
        wheel.turn();
    }
}
