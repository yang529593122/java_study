package velometer;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(20);
        Velometer velometer = new Velometer(10);
        velometer.speed(car);
    }
}
