import java.util.List;
import java.util.Arrays;

public class methodreference{
   public static void main(String[] args){
     
     List<String> names = Arrays.asList("Anshika", "Baliyan", "Choudhary");
     // Using lambda expression
        names.forEach(name -> System.out.println(name));

    // Using method reference
    //without
    //system.out.println(name);
    //name(system.out::println);
    //name.foreach(system.out::println);

        names.forEach(System.out::println);    //classname :: methodreference
   }
}