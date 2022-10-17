import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Homework_1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in); // String username = scanner.nextLine(); если бы строка
        int number = sc.nextInt();

        int sum_nums = 0;
        int mult_nums = 1;

        for (int i = 1; i <= number; i++) {
            sum_nums = sum_nums + i;
            mult_nums = mult_nums * i;
        }
    System.out.println("Nth triangular number => " + sum_nums);
        System.out.println("N! => " + mult_nums);
    }
}