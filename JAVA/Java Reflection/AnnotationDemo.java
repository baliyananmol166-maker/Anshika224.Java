//we can access the annotations defined at object, method, field, and parameter level using reflection.
// @Retention is used to specify how long the annotation should be retained.

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value = "Hello, Annotation!")
public class AnnotationDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("AnnotationDemo");

            if (cls.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = cls.getAnnotation(MyAnnotation.class);
                System.out.println("Value: " + annotation.value());
            } else {
                System.out.println("MyAnnotation is not present on the class.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception is caught");
        }
    }
}