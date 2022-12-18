package Exc_Homework1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Logger excLog = Logger.getAnonymousLogger();

        int[] array = {1, 6, 4, 9, 0, 5};

        String filename = "D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_Homework4\\Planner\\Planner.txt";

        excLog.info(checkOne(array));
        excLog.info(checkTwo(filename));
        excLog.info(checkThree(array));

    }

    public static String checkOne(int[] arr) {
        String message = "Exception handled if it happend";
        try {
            System.out.println(arr[9]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Add the new value for your massive!" + e.getClass());
        }
        return message;
    }

    public static String checkTwo(String filename) throws IOException {
        String message = "Two exceptions are handled";
        FileReader reader = null;
        try {
            reader = new FileReader(filename);
            reader.read();
        } catch (RuntimeException | FileNotFoundException e) {
            System.out.println("Exceptions in this method" + e.getClass());
        } finally {
            System.out.println("start finally");

            assert reader != null;
            reader.close();

            System.out.println("finish finally");
        }
        return message;
    }

    public static String checkThree(int[] arr) {
        String message = "exceptions are handled";
        String messageForMassive = "e15";
        try {
            arr[0] = 3;
            arr[1] = 0;
            arr[2] = (arr[0] / arr[1]);
            arr[6] = arr[0];

            if (!(arr[1] == 0)) {
                arr[6] = arr[0];
            }
            System.out.println(arr[6]);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = Integer.parseInt(messageForMassive);
                }
                System.out.println(arr[i]);
            }

        } catch (ArithmeticException e) {
            return "Try another value for your formula " + (e.getClass().getSimpleName()) + "\n" + arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Write an another index or length of massive" + (e.getClass().getSimpleName());
        } catch (NumberFormatException e) {
            return "Choose int value" + (e.getClass().getSimpleName()) + (e.getClass().getSimpleName()) + "\n" + messageForMassive;
        } return message;
    }
}
