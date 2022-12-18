package Exc_Homework1;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше */

import java.util.Arrays;
import java.util.logging.Logger;

public class Task3 {
    public static void main(String[] args) {

        Logger logExc4 = Logger.getAnonymousLogger();

        int[] four = {6, 9, 12, 21, 18};
        int[] five = {1, 3, 2, 7};

        logExc4.info(checkExc4(four, five));

    }

    public static String checkExc4(int[] arr, int[] arr2) {
        String sixStr = new String();
        int[] six = new int[arr.length];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            try {
                six[i] = arr[i] / arr2[i];
                sixStr = Arrays.toString(six);
                if (!(arr.length == arr2.length)) {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                return "Change length your massive " + (e.getClass());
            }
        }
        return sixStr;
    }
}
