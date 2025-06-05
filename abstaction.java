package project1;

abstract class Car {
    abstract void drive();
    abstract void stop();
}

class MyCar extends Car {
    @Override
    void drive() {
        System.out.println("Driving the car using steering and pedals.");
    }

    @Override
    void stop() {
        System.out.println("Stopping the car using the brake.");
    }
}

public class abstaction {
    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.drive();
        car.stop();
    }
}