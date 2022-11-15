package HW5;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class HomeWork5Task1 {
    public static void main(String[] args) {
        writePhones();
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

        System.out.println(phoneBook);

        String first = phoneBook.get(89356782);
        String second = phoneBook.get(89256609);
        System.out.println(first);
        System.out.println(second);

        return phoneBook;
    }

// Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
    public static Map<String, String> countWorkers() {
        Map<String, String> workers = new HashMap<>();

        workers.put("Petrova", "Svetlana");
        workers.put("Belova", "Cristina");
        workers.put("Musina", "Anna");
        workers.put("Krutova", "Anna");
        workers.put("Yurin", "Ivan");
        workers.put("Likov", "Petr");
        workers.put("Chernov", "Pavel");
        workers.put("Chernishev", "Petr");
        workers.put("Fedorova", "Maria");
        workers.put("Svetlova","Marina");
        workers.put("Savina", "Maria");
        workers.put("Rikova","Maria");
        workers.put("Lugova", "Maria");
        workers.put("Bladimirova", "Anna");
        workers.put("Mechnikov", "Ivan");
        workers.put("Petin", "Petr");
        workers.put("Ezhov", "ivan");

        for (int i = 0; i < workers.size(); i++) {
            
        }
    }
}
