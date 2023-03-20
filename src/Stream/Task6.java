package Stream;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 23, 3, 423, 622);
        boolean presenceOfThreeDigitElements = numbers.stream()
                .filter(num -> num > 99 && num < 1000 || num < -100 && num < -1000)
                .findFirst()
                .isPresent();

        System.out.println (presenceOfThreeDigitElements);

    }
}
