import java.util.logging.*;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
/* 1 Расширение файла: txt

2 Расширение файла: pdf

3 Расширение файла:

4 Расширение файла: jpg */
// К калькулятору из предыдущего дз добавить логирование.

public class Homework_2 {

    public static String main(String[] args) {
        Random random = new Random();
        int[] arrayToBeSorted = random.ints(100, 10, 100).toArray();

        //logSort.info(arrayToBeSorted.toString());
        //logSort.info(sortArray(arrayToBeSorted, logSort).toString());
        Logger logSort = Logger.getAnonymousLogger();
        FileHandler fileHandler;

        try {

            fileHandler = new FileHandler("D:\Курс Разработчик\II Четверть\02 Java\Lesson2\Lesson2\src\logSort.txt");
            logSort.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }

        private static String sortArray ( int[] array){

            String arrayToString = null;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        arrayToString = Arrays.toString(array);
                    }
                }
            }
            return arrayToString;
        }
    }
