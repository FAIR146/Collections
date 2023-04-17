package Tasks;

import java.util.ArrayList;

public class Task25 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        if (arrayList.size() > 0) {
            System.out.println("список не пуст");
        }
        else {
            System.out.println("Cписок пуст");
        }
        System.out.println(arrayList.isEmpty());
    }
}
