package Exc_Homework2.Home;

/*Исправить код там, где нужно
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}*/


import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {

        Logger logChekTask = Logger.getAnonymousLogger();

        int[] checkArray = {5, 7, 8, 1, 0, 4, 0, 8, 3};
        logChekTask.info(checkArr(checkArray));
    }

    public static String checkArr(int[] arr) {
        String message = "Processed successfully";
        try {
            int d = 5;
            double catchedRes1 = arr[8] / d;
            System.out.println("catchedRes1: " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
        } return message;
    }

}
