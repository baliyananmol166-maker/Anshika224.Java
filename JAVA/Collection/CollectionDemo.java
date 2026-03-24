//This program is show the use of collection framework in java
//it consists of set of interfaces and utility classes used for storing, searching and arranging objects.
import java.util.Arrays;
import java.util.Collections;

public class CollectionDemo {
    public static void main(String[] argss) {
        Employee[] arr = new Employee[2];
        Employee e1 = new Employee(1,"ABC");
        Employee e2 = new Employee(2,"XYZ");
        arr[0] = e1;
        arr[1] = e2;
        for(int i = 0; i<arr.length; i++) {
            System.out.println("The value of emp is: " +arr[i].empName);   
        }
        Collections.sort(Arrays.asList(arr));

        for(int i= 0; i <arr.length; i++) {
            System.out.println("The value of emp is: " +arr[i].empName);
        }
    }
}
class Employee implements Comparable {
    int empId;
    String empName;

    Employee(int empId, String empName) {
       super();
       this.empId = empId; 
       this.empName = empName;
    }
    @Override
    public int compareTo(Object o) {
        int relVal;
        if(o instanceof Employee) {
            Employee e = (Employee) o;
            relVal = this.empId - e.empId;
        } else {
            throw new ClassCastException("Passed object is not of type Employee");

        }
        return relVal;
    }
}