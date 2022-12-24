package Exc_Homework2.Home;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Task1 {
    public static void main(String[] args) {
        boolean check = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (check) {
            try {
                System.out.println("Enter the float number: ");
                float number = Float.parseFloat(reader.readLine());
                System.out.println("Introduced value is float");
                check = false;
            } catch (NumberFormatException | InputMismatchException | IOException e) {
                System.out.println("Introduced value is not float (!) Repeat your try again: ");
            }
        }
    }
}

