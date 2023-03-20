package Stream;

import java.util.List;
// Найти максимальный элемент массива
public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2);
        System.out.println(findMaxElement(numbers));

    }
    public static Integer findMaxElement (List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .orElse(null);
    }
}
