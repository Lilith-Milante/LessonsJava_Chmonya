package Exc_Homework2.Home;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your message here: ");

        try {
            String message = reader.readLine();
            if(message.equals("")) {
                throw new RuntimeException("Error! String is empty (!)");
            }

            System.out.println(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
