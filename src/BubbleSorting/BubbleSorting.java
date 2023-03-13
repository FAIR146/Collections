package BubbleSorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {2,7,1,9,4};


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        bubbleSorting(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] bubbleSorting (int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        return array;
    }
}
