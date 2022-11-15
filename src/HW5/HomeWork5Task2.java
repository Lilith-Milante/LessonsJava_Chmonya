package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class HomeWork5Task2 {
    public static void main(String[] args) {

        Logger logger2 = Logger.getAnonymousLogger();
        logger2.info((String.valueOf(countWorkers())));
    }
    public static ArrayList<Integer> countWorkers() {
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

        int repit = 0;
        String[] names = workers.values().toArray(new String[0]);
        ArrayList <Integer> count = new ArrayList<>();
        for (int i = 0; i < names.length - 1; i++) {

            if (names[i].equals(names[i + 1])) {
                repit += 1;
            }
            count.add(repit);
            repit = 0;
        }
        return count;
    }
}
