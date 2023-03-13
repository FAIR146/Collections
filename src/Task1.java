import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int didNotChangePosition = 0;
        int quantityRepetitions = 10;

        for (int i = 0; i <= quantityRepetitions; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j <= 500000; j++) {
                arrayList.add(i);
            }
            didNotChangePosition += checkForAChangeLocationElement(arrayList);
        }
        System.out.println((didNotChangePosition * 1.0) / quantityRepetitions);

        int notChangePositionRandom = 0;
        for (int i = 0; i <= quantityRepetitions; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j <= 500000; j++) {
                arrayList.add(i);
            }
            notChangePositionRandom += checkForAChangeLocationElementRandom(arrayList);
        }
        System.out.println((notChangePositionRandom * 1.0) / quantityRepetitions);


//        Random random2 = new Random();
//        for (int i = 0; i < arrayList.size(); i++) {
//            int fromIndex = random.nextInt(arrayList.size());
//            int toIndex = random.nextInt(arrayList.size());
//            swap(arrayList, i, toIndex);
//        }
//        int didNotChangePositionRndm = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.equals(arrayList1))
//            {
//                didNotChangePositionRndm++;
//            }
//        }
//        Random random3 = new Random();
//        for (int i = 0; i < arrayList.size(); i ++) {
//            int fromIndex = random.nextInt(arrayList.size());
//            int toIndex = random.nextInt(arrayList.size());
//            swap(arrayList,i,toIndex);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.equals(arrayList1))
//            {
//                didNotChangePositionRndm++;
//            }
//        }
//        System.out.println("Чисел не поменявших свои места при fromIndex = random "  + didNotChangePositionRndm);

    }

    public static void swap(ArrayList<Integer> arrayList, int fromIndex, int toIndex) {
        int elementReserv = arrayList.get(fromIndex);
        arrayList.set(fromIndex, arrayList.get(toIndex));
        arrayList.set(toIndex, elementReserv);
    }

    public static int checkForAChangeLocationElement (ArrayList<Integer> arrayList) {
        int didNotChangePosition = 0;
        Random random = new Random();
        for (int i = 0; i < arrayList.size(); i++) {
            int fromIndex = i;
            int toIndex = random.nextInt(arrayList.size());
            swap(arrayList, i, toIndex);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == i) {
                didNotChangePosition++;
            }
        }
        return didNotChangePosition;
    }
    public static int checkForAChangeLocationElementRandom (ArrayList<Integer> arrayList) {
        int didNotChangePosition = 0;
        Random random = new Random();
        for (int i = 0; i < arrayList.size(); i++) {
            int fromIndex = random.nextInt(arrayList.size());
            int toIndex = random.nextInt(arrayList.size());
            swap(arrayList, fromIndex, toIndex);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == i) {
                didNotChangePosition++;
            }
        }
        return didNotChangePosition;
    }
}
