package Exc_Homework1;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

import java.util.Arrays;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {

        Logger logExc2 = Logger.getAnonymousLogger();

        int[] one = {6, 9, 3, 7, 2};
        int[] two = {1, 8, 2, 5};

        logExc2.info(checkExc3(one, two));

    }

    public static String checkExc3(int[] arr, int[] arr2) {
        String threeStr = new String();
        int[] three = new int[arr.length];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            try {
                three[i] = arr[i] - arr2[i];
                threeStr = Arrays.toString(three);
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Change length your massive " + (e.getClass());
            }
        }
        return threeStr;
    }
}
