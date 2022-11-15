package HW5;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HomeWork5Task1 {
    public static void main(String[] args) {

        Logger log1 = Logger.getAnonymousLogger();
        log1.info(String.valueOf(writePhones()));
    }

    public static Map<Integer, String> writePhones() {

        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(89256789, "Anna");
        phoneBook.put(89258921, "Sergey");
        phoneBook.put(89076788, "Anna");
        phoneBook.put(89356782, "Egor");
        phoneBook.put(89246489, "Viktoria");
        phoneBook.put(89325789, "Anna");
        phoneBook.put(89788889, "Alexey");
        phoneBook.put(89256609, "Egor");
        phoneBook.put(89244789, "Egor");

        String first = phoneBook.get(89356782);
        String second = phoneBook.get(89256609);

        Logger log2 = Logger.getAnonymousLogger();
        log2.info(String.valueOf(first));
        log2.info(String.valueOf(second));

        return phoneBook;
    }
}
