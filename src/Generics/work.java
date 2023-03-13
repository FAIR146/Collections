package Generics;

import java.util.ArrayList;

public class work {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);

        Login<String,String> user1 = new Login<>("user1", "1234w");
        System.out.println(user1.getLogin());
        System.out.println(user1.getPassword());
    }
}
