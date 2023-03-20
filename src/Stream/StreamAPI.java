package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> onlyEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(onlyEven);
    }
}
