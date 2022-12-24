package Exc_Homework2.Home;

import java.io.FileNotFoundException;

/* Исправить код там, где нужно :

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

*/
public class Task3 {

    public static void main(String[] args) {

        printMlt(90, 3);
        printSum(23, 234); // 257

        try {

            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong index(!) " + ex.getClass().getSimpleName());
        }
    }

    public static void printMlt(Integer a, Integer b) {
        System.out.println(a / b);
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
