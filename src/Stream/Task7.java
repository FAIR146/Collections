package Stream;

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,8,16,4,32);
        System.out.println(findMaxElement(numbers));

    }
    public static Integer findMaxElement (List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .get();
    }
}
