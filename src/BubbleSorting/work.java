package BubbleSorting;

import java.util.ArrayList;

public class work {
    public static void main(String[] args) {
        Human human1 = new Human("Andrey",70,176);
        Human human2 = new Human("Stepa",67,170);
        Human human3 = new Human("Maksim",63,180);
//        Human human4 = new Human();
//        Human human5 = new Human();
//        Human human6 = new Human();
//        Human human7 = new Human();
//        Human human8 = new Human();
//        Human human9 = new Human();
//        Human human10 = new Human();


        Human[] humans = {human1, human2, human3};
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
        System.out.println();
        bubbleSortingHeight(humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }



    }
    public static void bubbleSortingHeight (Human[] humans) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < humans.length - 1; i++) {
                if (humans[i].getHeight() > humans[i + 1].getHeight()) {
                    isSorted = false;
                    Human buffer = humans[i];
                    humans[i] = humans[i + 1];
                    humans[i + 1] = buffer;
                }
            }
        }
    }
}
