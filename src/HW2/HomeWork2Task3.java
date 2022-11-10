package HW2;

import java.util.logging.*;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл

public class HomeWork2Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayToBeSorted = random.ints(50, 10, 100).toArray();

        Logger logSort = Logger.getAnonymousLogger();
        logSort.info(sortArray(arrayToBeSorted, logSort));

        FileHandler fileHandler;

        try {

            fileHandler = new FileHandler("D:/Курс Разработчик/II Четверть/02 Java/Lesson2/Lesson2/src/logSort.txt");
            logSort.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String sortArray(int[] array, Logger logSort){

        String arrayToString = null;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    arrayToString = Arrays.toString(array);
                    logSort.info(arrayToString);
                }
            }
        }
        return arrayToString;
    }
}