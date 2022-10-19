import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Вывести все простые числа от 1 до 1000
// Реализовать простой калькулятор

public class Homework_1 {
    public static void main(String[] args) {
        MultNums(args);
        TriangleNumber(4);
        SimpleNumbers(1000); // но мы можем задавать любое
        Calculate(args); // передаём в методе
    }
    public static void MultNums(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in); // String username = scanner.nextLine(); если бы строка
        int number = sc.nextInt();

        int mult_nums = 1;

        for (int i = 1; i <= number; i++) {
            mult_nums = mult_nums * i;
        }
        System.out.println("N! => " + mult_nums);
    }
    public static void TriangleNumber(int num1) {
        int triangular = ((num1) * (num1 + 1) / 2);
        System.out.println("Nth triangular number => " + triangular);
    }
    public static void SimpleNumbers(int edge) {
        for (int i = 2; i < edge; i++) {
            boolean simple_num = true;
            int k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    simple_num = false;
                }
            }
            if (simple_num) System.out.println("Simple number => " + i + ";");
        }
    }
    public static void Calculate(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            float num1 = s.nextFloat();

            System.out.print("Enter the action => (+, -, * or /): ");
            String action = s.next();

            System.out.print("Enter the second number: ");
            float num2 = s.nextFloat();

            System.out.println(count(num1, num2, action));
            }
        }
    static float count(float num1, float num2, String act) {
        float res = 0;
        switch (act) {
            case ("+"):
                res = num1 + num2;
                return res;
            case ("-"):
                res = num1 - num2;
                return res;
            case ("*"):
                res = num1 * num2;
                return res;
            case ("/"):
                res = num1 / num2;
                return res; // можно переводить результат в инт, но не всегда получается целое число
            default:
                System.out.println("Check your actions about right (!)");
                return 0;
        }
    }
}