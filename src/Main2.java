import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(4);


        HashSet<Integer> hashSet = new HashSet<>(arrayList);

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(0);
        hashSet.add(-1);
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(-1);
        linkedHashSet.add(0);
        System.out.println(linkedHashSet);
    }
}
