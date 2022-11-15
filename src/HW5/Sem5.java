package HW5;

// 1. Создать структуру для хранения номеров паспортов и фамилий сотрудников организации
/*      123456 Иванов

        321456 Васильев

        234561 Петрова

        234432 Иванов

        654321 Петрова

        345678 Иванов

        Вывести данные по сотрудникам с фамилией Иванов*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.List;

public class Sem5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Ivanov");
        db.put(321456, "Vasilev");
        db.put(234561, "Petrova");
        db.put(234432, "Ivanov");
        db.put(654321, "Petrova");
        db.put(345678, "Ivanov");

        Logger logger = Logger.getAnonymousLogger();

        logger.info(String
                .valueOf(db.keySet().stream().filter(n -> db.get(n).equals("Ivanov")).collect(Collectors.toList())));

        for (Integer key : db.keySet()) {
            if (db.get(key).equals("Ivanov")) {
                logger.info(String.valueOf(key) + " " + db.get(key));
            }
        }
        Logger logger2 = Logger.getAnonymousLogger();
        logger2.info(String.valueOf(isIsomorf("aia","poo")));

        Logger logger3 = Logger.getAnonymousLogger();
        logger3.info(String.valueOf(findHooks("[a+(1*3)")));

        Logger logger4 = Logger.getAnonymousLogger();
        logger4.info(String.valueOf(romanToInteger("MMXXII")));
    }
// 2. Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//Пример 1:
//
//Input: s = "foo", t = "bar"
//
//Output: false
//
//Пример 2:
//
//Input: s = "paper", t = "title"
//
//Output: true

    public static boolean isIsomorf(String first, String second) {
        Map<Character, Character> stringMap = new HashMap<>();
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        if (firstChars.length != secondChars.length) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (!stringMap.containsKey(firstChars[i])) {
                if (stringMap.values().contains(secondChars[i])) {
                    return false;
                }
                stringMap.put(firstChars[i], secondChars[i]);
            } else if (!(stringMap.get(firstChars[i]) == secondChars[i])) {
                return false;
            }
        }
        return true;

    }
// 3. Написать программу, определяющую правильность расстановки скобок в выражении.
//
//Пример 1: a+(d*3) - истина
//
//Пример 2: [a+(1*3) - ложь
//
//Пример 3: [6+(3*3)] - истина
//
//Пример 4: {a}[+]{(d*3)} - истина
//
//Пример 5: <{a}+{(d*3)}> - истина
//
//Пример 6: {a+]}{(d*3)} - ложь
    public static boolean findHooks(String exp) {
        char[] charExp = exp.toCharArray();
        Stack<Character> stack = new Stack<>();

        List<Character> openContainer = new ArrayList<>();
        openContainer.add('(');
        openContainer.add('[');
        openContainer.add('{');
        openContainer.add('<');

        List<Character> closeContainer = new ArrayList<>();
        closeContainer.add(')');
        closeContainer.add(']');
        closeContainer.add('}');
        closeContainer.add('>');

        for (char item : charExp) {
            if (openContainer.contains(item)) {
                stack.push(item);
            } else if (closeContainer.contains(item)) {
                if (stack.isEmpty() || !openContainer.get(closeContainer.indexOf(item)).equals(stack.peek())) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

// 4. Написать метод, которы переведёт число из римского формата записи в арабский
    // например, MMXXII = 2022

    public static Integer romanToInteger(String roman) {
        Map <Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        char[] romanNumber = roman.toCharArray();
        //Integer[] arabicNumber = new Integer[romanNumber.length];
        int number = 0;
        for (int i = 0; i < romanNumber.length - 1; i++) {
            if (dict.get(romanNumber[i]) >= dict.get(romanNumber[i + 1])) {
                number += dict.get(romanNumber[i]);
            } else {
                number -= dict.get(romanNumber[i]);
            }
        }
        number += dict.get(romanNumber[romanNumber.length - 1]);
        return number;
    }

    public static String integerToRoman(int arabic) {
        Map<Integer, String> dict = new HashMap<>();
        dict.put(1000, "M");
        dict.put(500, "D");
        dict.put(100, "C");
        dict.put(50, "L");
        dict.put(10, "X");
        dict.put(5, "V");
        dict.put(1, "I");

        dict.put( 900, "CM");
        dict.put( 400, "CD");
        dict.put(90, "XC");
        dict.put( 40,"XL");
        dict.put( 9,"IX");
        dict.put( 4,"IV");
        StringBuilder romanNumber = new StringBuilder();
        while (arabic > 0) {
            while (arabic / 1000 >= 1) {
                romanNumber.append(dict.get(1000));
                arabic -= 1000;
            }
            while (arabic / 100 >= 1) {
                if (dict.containsKey(arabic - arabic % 100)) {
                    romanNumber.append(dict.get(arabic - arabic % 100));
                    arabic = arabic % 100;
                }
                if (arabic >= 500) {
                    romanNumber.append(dict.get(500));
                    arabic = arabic - 500;
                }
                else {
                    if (arabic >= 100){
                        romanNumber.append(dict.get(100));
                        arabic -=100;
                    }
                }
            }
            while (arabic / 10 >= 1) {
                if (dict.containsKey(arabic - arabic % 10)) {
                    romanNumber.append(dict.get(arabic - arabic % 10));
                    arabic = arabic % 10;
                }
                if (arabic >= 50) {
                    romanNumber.append(dict.get(50));
                    arabic -=50;
                }
                else {
                    if (arabic >= 10){
                        romanNumber.append(dict.get(10));
                        arabic -=10;
                    }
                }
            }
            while (arabic> 0) {
                if (dict.containsKey(arabic)) {
                    romanNumber.append(dict.get(arabic));
                    arabic = 0;
                }
                if (arabic >= 5) {
                    romanNumber.append(dict.get(5));
                    arabic -=5;
                }
                else {
                    if (arabic >= 1){
                        romanNumber.append(dict.get(1));
                        arabic -=1;
                    }
                }
            }
        }
        return romanNumber.toString();
    }
}