package HW4;

// 4. Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.

import java.util.Queue;
import java.util.Stack;
import java.util.logging.Logger;

public class HomeWork4Task4 {
    public static void main(String[] args) {

        String infix = "x ^ y / (5 * z) + 10";

        Logger log6 = Logger.getAnonymousLogger();
        log6.info(String.valueOf("Original expression " + infix));

        Logger log7 = Logger.getAnonymousLogger();
        log7.info(String.valueOf("Converted expression " + infixToPostfix(infix)));

    }

    public static int priority(char c) { // проверка приоритета операции

        if (c == '*' || c == '/') {
            return 3;
        } if (c == '+' ||  c == '-') {
            return 4;
        } if (c == '&') {
            return 8;
        } if (c == '^') {
            return 9;
        } if (c == '|') {
            return 10;
        }
        return c;
    }

    public static boolean isOperand(char c) { // проверяем, операнд ли наш символ
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    public static String infixToPostfix(String infix) {

        if (infix.length() == 0) { // если выражение закончилось
            return infix;
        }

        Stack<Character> stackOperand = new Stack<>();
        String postfix = "";

        for (char c: infix.toCharArray()) {
            if (c == '(') {
                stackOperand.add(c);
            }
            else if (c == ')') {
                while (stackOperand.peek() !='(') { //извлекаем символы из стека до след скобок и прибавляем их к итоговой строке
                    postfix += stackOperand.pop();
                }
                stackOperand.pop();
            } else if (isOperand(c)) { // если символ операнд, отправляем в постфиксную запись
                postfix += c;
            } else {
                while(! stackOperand.isEmpty() && priority(c) >= priority(stackOperand.peek())) { // удаляем из стека операторы с более высоким или равным приоритетом, добавляем в конец нашего выражения
                    postfix += stackOperand.pop();
                }
            stackOperand.add(c); // помещаем операнд на вершину стэка
            }
        }
        while(!stackOperand.isEmpty()) {
            postfix += stackOperand.pop();
        }
        return postfix;
    }
}
