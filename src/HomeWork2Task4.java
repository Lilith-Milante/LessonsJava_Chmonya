// К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.*;

public class HomeWork2Task4 {
    public static void main(String[] args) {
        Calculate(args);
    }
    public static void Calculate(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            float num1 = s.nextFloat();

            System.out.print("Enter the action => (+, -, * or /): ");
            String action = s.next();

            System.out.print("Enter the second number: ");
            float num2 = s.nextFloat();

            Logger logger3 = Logger.getAnonymousLogger();
            System.out.println(count(num1, num2, action, logger3));
        }
    }
    static float count(float num1, float num2, String act, Logger logger3) {
        float res = 0;
        switch (act) {
            case ("+"):
                logger3.info(String.valueOf(num1 + num2));
                res = num1 + num2;
                return res;
            case ("-"):
                logger3.info(String.valueOf(num1 - num2));
                res = num1 - num2;
                return res;
            case ("*"):
                logger3.info(String.valueOf(num1 * num2));
                res = num1 * num2;
                return res;
            case ("/"):
                logger3.info(String.valueOf(num1 / num2));
                res = num1 / num2;
                return res;
            default:
                System.out.println("Check your actions about right (!)");
                logger3.info("Strange things are happen");
                return 0;
        }
    }
}
