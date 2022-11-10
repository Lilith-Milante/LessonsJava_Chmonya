package HW3;

import java.util.Objects;
import java.util.logging.Logger;
import java.util.logging.Level;

//1. Реализовать алгоритм сортировки слиянием

public class HomeWork3Task1 {
    public static void main(String[] args) {
        int[] toSort = new int[] {5, 4, 0, 9, 3, 2, 8};
        int [] sorted = arraySort(toSort);

        Logger log = Logger.getAnonymousLogger();
        for (int i: sorted) {
            log.info(i + " ");
        }

        Logger logSort = Logger.getLogger(HomeWork3Task1.class.getName());
        logSort.log(Level.INFO, "merge sort completed");
    }

    private static int [] arraySort(int []startArray) {
        if (startArray == null) {
            return null;
        }

        if (startArray.length < 2) {
            return startArray;
        }

        int[] secondArray = new int[startArray.length / 2]; // левая часть массива
        System.arraycopy(startArray, 0, secondArray, 0, startArray.length / 2);

        int[] thirdArray = new int[startArray.length - secondArray.length]; // правая часть массива
        System.arraycopy(startArray, secondArray.length, thirdArray, 0, startArray.length - secondArray.length);

        secondArray = arraySort(secondArray);
        thirdArray = arraySort(thirdArray);

        mergeSort(startArray, secondArray, thirdArray);

        return startArray;
    }
    private static void mergeSort(int[] startArray, int[] secondArray, int[] thirdArray) {

        int positionSt = 0;
        int positionSc = 0;

        for (int i = 0; i < startArray.length; i++) {
            if(Objects.equals(positionSt, secondArray.length)) {
                startArray[i] = thirdArray[positionSc];
                positionSc++;
            } else if (Objects.equals(positionSc, thirdArray.length)) {
                startArray[i] = secondArray[positionSt];
                positionSt++;
            } else if (secondArray[positionSt] < thirdArray[positionSc]) {
                startArray[i] = secondArray[positionSt];
                positionSt++;
            } else {
                startArray[i] = thirdArray[positionSc];
                positionSc++;
            }
        }
    }
}