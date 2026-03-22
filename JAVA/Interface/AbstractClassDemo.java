//abstract class is a class that cannot be instantiated and is meant to be subclassed. It can contain abstract methods (methods without a body) that must be implemented by subclasses, as well as concrete methods (methods with a body) that can be inherited by subclasses. Abstract classes are used to provide a common base for related classes and to enforce a certain structure on the subclasses.
public class AbstractClassDemo {
    public static void main(String[] args) {

        Employee emp1 = new ContractualEmployee("A", "IT", 100000.0f);
        Employee emp2 = new RegularEmployee("B", "HR", 200000.0f);

        System.out.println("Employee Name: " + emp1.getName() +
                ", Department: " + emp1.getDepartment() +
                ", Salary: " + emp1.getSalary());

        System.out.println("Employee Name: " + emp2.getName() +
                ", Department: " + emp2.getDepartment() +
                ", Salary: " + emp2.getSalary());
    }
}

// Abstract class
abstract class Employee {
    String name;
    int dob;
    String department;
    float salary;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public int getDOB() {
        return this.dob;
    }

    public String getDepartment() {   
        return this.department;
    }

    abstract float getSalary();
}

// Contractual Employee
class ContractualEmployee extends Employee {

    ContractualEmployee(String name, String dep, float salary) {
        super(name, dep);
        this.salary = salary;
    }

    @Override
    float getSalary() {
        return this.salary * 0.5f;
    }
}

// Regular Employee
class RegularEmployee extends Employee {

    public RegularEmployee(String name, String dep, float salary) {
        super(name, dep);
        this.salary = salary;
    }

    @Override
    float getSalary() {
        return this.salary;
    }
}