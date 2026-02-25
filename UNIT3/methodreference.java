import java.util.List;
import java.util.Arrays;

public class methodreference{
   public static void main(String[] args){
     
     List<String> names = Arrays.asList("A", "B", "C");
     // Using lambda expression
        names.forEach(name -> System.out.println(name));

    // Using method reference
        names.forEach(System.out::println);
   }
}