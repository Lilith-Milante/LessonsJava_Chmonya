package OOP_Homework5.util;

import java.util.Scanner;

public class ReadFromConcole {
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        return scanner.nextLine();
    }
}
