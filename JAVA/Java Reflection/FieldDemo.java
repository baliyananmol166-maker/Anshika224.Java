//fields method is used to get the fields of a class.

import java.lang.reflect.Field;

public class FieldDemo {
    public int intField;
    public String stringField;

    public static void main(String[] args) {
       FieldDemo d = new FieldDemo();
       Field[] f = d.getClass().getFields();
       for (Field f1 : f) {
           System.out.println("Field name: " + f1.getName());
           System.out.println("Field type: " + f1.getType());
       } 
        
    }
}