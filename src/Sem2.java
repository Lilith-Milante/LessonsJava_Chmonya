import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

// 1. Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из
// чередующихся символов c1 и c2, начиная с c1.

public class Sem2 {

    public static void main(String[] args) {

        String str1 = "A";
        String str2 = "B";
        int n = (new Scanner(System.in)).nextInt();
        Logger logger = Logger.getAnonymousLogger();
        logger.info(res(n, str1, str2));
    }

    private static String res(int n, String s, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(s);
            sb.append(b);
        }
        return sb.toString();
    }
// final String FIRST_PHRASE = "" - делает неизменяемую строку

    // 2. напишите метод, который сжимает строку.
    public static void String(String[] args) {
        String str3 = "aaaabbbacdd";
        System.out.println(Lessness(str3));
        Logger logger = Logger.getAnonymousLogger();
        logger.info(Lessness(str3));
    }

    private static String Lessness(String string) {
        StringBuilder sb = new StringBuilder(string);
        String res = "";
        int count = 1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == (sb.charAt(i - 1))) {
                ++count;
            } else {
                res += String.valueOf(count) + sb.charAt(i - 1);
                count = 1;
            }
        }
        res += String.valueOf(count) + sb.charAt(sb.length() - 1);
        return res;
    }
// как ещё можно решить:
    private String search(String str) {

        int size = countCompression(str);
        if (size >= str.length()) {
            return str;
        }

        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                mystr.append(last);
                mystr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }

        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }
    int countCompression(String str) {
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 0;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;
    }
// Напишите метод, который принимает на вход строку и определяет, является ли она палиндромом
// возвращает значение bool

    public static void str(String[] args) {
        String str4 = "12356";
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(smth(str4)));
    }
    public static boolean smth(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.reverse().toString().equals(str)) {
            return true;
        }
        return false;
    }
// кк ещё можно решить
    public static void mn(String[] args) {
        Logger l = Logger.getAnonymousLogger();
        l.info(String.valueOf(isPalindrome("redidider")));
    }
    private static boolean isPalindrome(String text) {
        StringBuilder builder = new StringBuilder(text.replaceAll("[a-zA-ZA-я]", ""));
        return builder.toString().equalsIgnoreCase(builder.reverse().toString());
    }
// напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения
    public static void mnmn(String[] args) throws IOException{
        String text = "TEST";
        writeInText(text);
    }
    private static void writeInText(String text) throws IOException{
        StringBuilder StringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            StringBuilder.append(text);
        }
            try(FileWriter writer = new FileWriter("result.txt", false)) {
                writer.write(StringBuilder.toString());
                writer.flush(); // очищает буфер, сохраняет изменения в файл
            }
    }
}