package Tasks;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class FunctionalInterface {
    public static void main(String[] args) {
        int[] array = {2,6,8,1,2,6};
        doSomethingWithArray(array, num -> num * num);
        System.out.println(Arrays.toString(array));
    }
    public static void doSomethingWithArray (int[] array ,UnaryOperator<Integer> unaryOperator) {
        for (int i =0; i < array.length; i++) {
            array[i] = unaryOperator.apply(array[i]);
        }
    }
 }
