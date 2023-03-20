package Stream;

import java.util.List;
import java.util.stream.Collectors;
// Убрать из массива повторяющиеся элементы
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,4,4,6);
        List<Integer> withOutRepeatElements = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(withOutRepeatElements);
    }
}
