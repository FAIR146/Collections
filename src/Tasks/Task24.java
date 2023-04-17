package Tasks;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(4);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(4);
        System.out.println(arrayList.equals(arrayList1));

        System.out.println(equals(arrayList, arrayList1));

    }
    public static boolean equals (ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrayList1.get(i)) {
                return false;
            }
        }
        return true;
    }
}
