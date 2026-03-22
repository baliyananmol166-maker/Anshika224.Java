// example of interface of animal(super class) and dog and cat(sub class).
interface Animal {
    void sound();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
     Animal a;

     a = new Dog(); 
     a.sound();

     a = new Cat();
     a.sound();   
    }
}