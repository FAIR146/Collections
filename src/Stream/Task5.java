package Stream;

import java.util.List;
// Вывести из массива первые 10 элементов
public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        numbers.stream()
                .limit(10)
                .forEach(Task5::printInteger);
    }
    public static void printInteger (Integer integer) {
        System.out.println(integer);
    }
}
