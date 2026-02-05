//super class
class Animal{
    String name;
    int age;
    void displayAnimal(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//sub class
class Dog extends Animal{
    int numbers;
    void displayDog(){
        System.out.println("Numbers: " + numbers);

    }

}

public class inheritence2 {
     public static void main(String[] args){
         Dog s=new Dog();
         s.name="abc";
         s.age=6;

         s.numbers=4;

         s.displayAnimal();
         s.displayDog();

     }
}