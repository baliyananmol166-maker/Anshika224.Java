//interface is a blueprint of a class. It has only abstract methods and final varables.
//it is used to achieve abstraction and multiple inheritance in java.
public class InterfaceDemo {
    public static void main(String[] args) {
        GasVehicle gasObj = new GasVehicle();
        gasObj.milesCounter = 100;
        gasObj.fuelConsumed = 20;
        System.out.println("Efficiency of the vehicle is: " + gasObj.getMileage());
    }
}
interface fuelEfficiency {
    int INTERFACE_VALUE = 10; //final variable
    float getMileage(); 
}
class GasVehicle implements fuelEfficiency {
    float milesCounter;
    float fuelConsumed;

    @Override
    public float getMileage() {
        //we can not assign a value to testInterface as it is final variable.
       System.out.println("The value of Interface is: " + INTERFACE_VALUE);
       System.out.println("The value of milesCounter is: " + milesCounter);
       System.out.println("The value of fuelConsumed is: " + fuelConsumed);
       return milesCounter/fuelConsumed;
    }

}