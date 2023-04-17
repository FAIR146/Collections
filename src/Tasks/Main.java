package Tasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 8, -1, 4, 7, 6, -2, -9, 10, -3};
        ArrayList<Integer> arrayListPositive = new ArrayList<>();
        ArrayList<Integer> arrayListNegative = new ArrayList<>();

       for (int i = 0; i < array.length; i++) {

           if (array[i] > 0) {
               arrayListPositive.add(array[i]);
           } else {
               arrayListNegative.add(array[i]);
           }
       }

//       System.out.println(arrayListPositive);
//        System.out.println(arrayListNegative);

//        for (int i = 0; i < arrayListPositive.size(); i++) {
//            System.out.println(arrayListPositive.get(i));
//        }
        ArrayList<Integer> arrayListAllNumbers = new ArrayList<>();
        arrayListAllNumbers.addAll(arrayListPositive);
        arrayListAllNumbers.addAll(arrayListNegative);
        System.out.println(arrayListAllNumbers);
    }
}
