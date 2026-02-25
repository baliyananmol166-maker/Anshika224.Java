abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike started");
    }
}

public class abstractexample {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();
        v1.fuel();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuel();
    }
}
