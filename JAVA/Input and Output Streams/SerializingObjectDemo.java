//serialization of objects is needed in case one wants to presist the object in the permanent storage.
//for reading and writing object we need to implement the Serializable interface in the class whose object we want to serialize.

import java.io.*;

public class SerializingObjectDemo {
    public static void main(String[] args) {

        // Serialization (Writing object)
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("cust.dat"))) {

            Customer c1 = new Customer("c1", 1);
            o.writeObject(c1);

        } catch (IOException e) {
            System.out.println(e);
        }

        // Deserialization (Reading object)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cust.dat"))) {

            Customer c2 = (Customer) in.readObject();
            System.out.println(c2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

// Serializable class
class Customer implements Serializable {

    private static final long serialVersionUID = 1L; 

    String name;
    Integer id;

    Customer(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name of the customer is " + name + " and id is " + id;
    }
}