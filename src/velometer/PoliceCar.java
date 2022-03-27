package velometer;

public class PoliceCar {
    private int speed;

    public PoliceCar() {
    }

    public PoliceCar(int speed) {
        this.speed = speed;
    }

    public void chase(Car car) {
        int carSpeed = car.getSpeed();
        if (this.speed > carSpeed) {
            System.out.println("开始追击");
            int time = 100 / (this.speed - carSpeed);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("经过" + time + "秒追到啦");
        } else {
            System.out.println("追不到啦");
        }
    }

}
