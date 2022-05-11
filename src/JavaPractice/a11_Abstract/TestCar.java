package JavaPractice.a11_Abstract;

public class TestCar {

    public static void main(String[] args) {

        Bmw b = new Bmw();
        b.start();
        b.stop();

        Car c = new Bmw();
        c.start();
        c.stop();

    }
}
