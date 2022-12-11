import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.math.*;
import javax.swing.text.Position;

/* Напишите метод, который находит самую длинную строку общего префикса среди массива строк.

Если общего префикса нет, вернуть пустую строку "". */
/*
public class Task4 {
    public static void main(String[] args) {
        static public String MaxCommonPrefix(String[] stringList) {
            String common = "";
            boolean flag = true;

            while (flag && common.length() < stringList[0].length()) {
                common += stringList[0].charAt(common.length());
                for (String str : stringList) {
                    if (!str.startsWith(common))
                        flag = false;
                }
            }
            if (flag)
                return common;
            else
                return common.substring(0, common.length() - 2);
        }
    }
}
*/
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
