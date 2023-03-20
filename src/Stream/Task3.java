package Stream;

import java.util.List;
// Выводить элементы массива, пока числа четные
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 2, 3, 4, 5);

        numbers.stream()
                .takeWhile(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

}
