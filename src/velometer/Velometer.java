package velometer;

public class Velometer {
    private int time;

    public Velometer() {
    }

    public Velometer(int time) {
        this.time = time;
    }

    public void speed(Car car) {
        int carSpeed = car.getSpeed();
        int carTime = 100 / carSpeed;
        if (this.time <= carTime) {
            System.out.println("速度正常");
        } else {
            System.out.println("超速啦！");
            PoliceCar pc = new PoliceCar(30);
            pc.chase(car);
        }
    }
}
