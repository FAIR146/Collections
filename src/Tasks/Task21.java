package Tasks;

import java.util.LinkedList;

public class Task21 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(2);


        System.out.println(linkedList.peekLast()); // 21. Напишите Java-программу для извлечения, но не удаления, последнего элемента связанного списка.
    }
}
