package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        String text = "собака кот машина собака птица кот";
        String[] wordsOfTheText = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < wordsOfTheText.length; i++) {
            hashMap.put(wordsOfTheText[i],hashMap.getOrDefault(wordsOfTheText[i],0)+ 1);
//            Integer value = hashMap.get(wordsOfTheText[i]);
//            if (value == null) {
//                hashMap.put(wordsOfTheText[i], 1);
//            } else {
//                hashMap.put(wordsOfTheText[i],value + 1);
//            }
        }


        

    }

}
