import BubbleSorting.Human;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        String text = "дом квартира";
        String[] wordsOfTheText = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < wordsOfTheText.length; i++) {
            hashMap.put(wordsOfTheText[i], hashMap.getOrDefault(wordsOfTheText[i], 0) + 1);
        }
//        System.out.println(hashMap);
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        for (Map.Entry<String, Integer> i : set) {
//            System.out.println(i);
        }
        Map.Entry<String, Integer>[] arrayWordsAndRepetitions = new Map.Entry[set.size()]; // .sort();
        set.toArray(arrayWordsAndRepetitions);
        bubbleSorting(arrayWordsAndRepetitions);
        for (int i = 0; i < arrayWordsAndRepetitions.length; i++) {
            System.out.println(arrayWordsAndRepetitions[i]);
        }
        int countOfElementsForPrint;
        if (arrayWordsAndRepetitions.length >= 3) {
            countOfElementsForPrint = 3;
        } else {
            countOfElementsForPrint = arrayWordsAndRepetitions.length;
        }
        for (int i = 0; i < countOfElementsForPrint; i++) {
            System.out.println(arrayWordsAndRepetitions[i]);
        }
//        if (arrayWordsAndRepetitions.length > 3) {
//            for (int i = 0; i < 3; i++) {
//                System.out.println(arrayWordsAndRepetitions[i]);
//            }
//        } else {
//            for (int i = 0; i < arrayWordsAndRepetitions.length; i++) {
//                System.out.println(arrayWordsAndRepetitions[i]);
//            }
//        }
    }

    public static void bubbleSorting(Map.Entry<String, Integer>[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getValue() < array[i + 1].getValue()) {
                    isSorted = false;
                    Map.Entry<String, Integer> buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }

        }
    }
}
