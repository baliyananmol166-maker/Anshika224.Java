// inner class is a class that is created inside a class but outside the mothod.
//it is also called non-static nested class.
public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.printStr();
    }
}
class Outer {
    private String str = "Outer Class";
    class Inner {
        String str = "Inner Class";
        void printStr() {
            System.out.println("The value of inner str is: " + str);
            System.out.println("The value of outer str is: " + Outer.this.str);
        }
    }
}