// another example of interface
interface Vehicle {
    void start();
    void stop();
    void accelerate();
}

// Car class implementing Vehicle interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }
}

// Main class
public class InterfaceExample2 {
    public static void main(String[] args) {

        Vehicle v;

        // Using Car
        v = new Car();
        v.start();
        v.stop();
        v.accelerate();

        System.out.println();

        // Using Bike
        v = new Bike();
        v.start();
        v.stop();
        v.accelerate();
    }
}