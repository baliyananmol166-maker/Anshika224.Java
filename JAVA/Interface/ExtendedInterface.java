//extended interface means the new interface will have all methods of the parent interface and it can have its own methods as well.
interface Vehicle {
    void start();
    void stop();
}
interface ElectricVehicle extends Vehicle {
    void charge();
}
class Tesla implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla is starting");
    }
    @Override
    public void stop() {
        System.out.println("Tesla is stopping");
    }
    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}
public class ExtendedInterface {
    public static void main(String[] args) {
        ElectricVehicle ev = new Tesla();

        ev.start();
        ev.stop();
        ev.charge();
        
    }
}