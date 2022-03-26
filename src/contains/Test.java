package contains;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("宝马","Z4","蓝色",new Wheel("米其林",70,"黑色"));
        car.showCar();
    }
}
