package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// Произвести сортировку массива
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 8, 1, 5, 4, 3);

        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
