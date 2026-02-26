import java.util.List;
import java.util.Arrays;

public class streamapi {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(n->n>25)
        .map(n->n*2)
        .forEach(System.out::println);
    }
}
Collection->stream->intermediate->t->res  //pipeline

list-stream()->map()->forEach->