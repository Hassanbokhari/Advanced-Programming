import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class assignment {
    public static void main(String[] args) {
        List<Integer> dataPoints = IntStream.range(1,51)
        .filter(i -> i % 2 == 1)
        .map(n -> 2 * n + 1)
        .boxed()
        .collect(Collectors.toList());

        System.out.println(dataPoints);
    }   
}
