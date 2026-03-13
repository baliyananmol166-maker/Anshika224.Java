public class DataTypeExamples {
    public static void main(String[] args){
        String name = "Anshika";
        int age = 18;
        double height = 5.01;
        boolean isStudent = true;
        char grade = 'A';
        float marks = 90.08f;
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height); 
        System.out.println("Is Student: " +isStudent);
        System.out.println("Grade: " +grade);
        System.out.println("Marks: " +marks);


        /* var keyword is used to declare a variable without specifying its data type. 
        The data type of the variable is inferred from the value assigned to it. 
        The var keyword can only be used for local variables and cannot be used for instance variables or class variables.*/
        var city = "Muzaffarnagar";
        var population = 3500000;
        var isDistrict = true;
        System.out.println("City: " +city);
        System.out.println("Population: " +population);
        System.out.println("Is District: " +isDistrict);
    }
}