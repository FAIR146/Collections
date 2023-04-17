package Tasks;

import java.util.ArrayList;

public class Task26 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(9);
        System.out.println(arrayList);

        arrayList.set(0,7); // 26. Напишите программу на Java для замены элемента в связанном списке.
        System.out.println(arrayList);
    }
}
