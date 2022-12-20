package Exc_Homework2.Sem;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter index: ");
        String string = scanner.next();

        if(!isNumber(string)) {
            System.out.println("Wrong data!");
            return; // типа как break
        }
        int inputInd = Integer.parseInt(string);
        if (!(0 <= inputInd && inputInd < arr.length)) {
            System.out.println("Index out of massive");
        }
        arr[inputInd] = 1;
    }

    private static boolean isNumber(String string) {
        char[] charArr = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if(!Character.isDigit(charArr[i]))
                return false;
        } return true;
    }
}
