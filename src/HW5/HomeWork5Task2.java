package HW5;

import java.util.*;
import java.util.logging.Logger;

// Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class HomeWork5Task2 {
    public static void main(String[] args) {

        Logger logger2 = Logger.getAnonymousLogger();
        logger2.info((String.valueOf(countWorkers())));
    }

    public static NavigableMap<Integer, List<String>> countWorkers() { // тип метода для возврата tree map в конце
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
        workers.put("Svetlova", "Marina");
        workers.put("Savina", "Maria");
        workers.put("Rikova", "Maria");
        workers.put("Lugova", "Maria");
        workers.put("Bladimirova", "Anna");
        workers.put("Mechnikov", "Ivan");
        workers.put("Petin", "Petr");
        workers.put("Ezhov", "ivan");

        String[] names = workers.values().toArray(new String[0]); // переводим в массив наш исходный "словарь"

        Map<String, Integer> countss = new HashMap<>();
        for (String t : names) {
            if (countss.containsKey(t)) {
                countss.put(t, countss.get(t) + 1); // увеличиваем число кол-ва элементов, которые уже содержатся в мапе
            } else {
                countss.put(t, 1);
            }
        }

        Logger logger3 = Logger.getAnonymousLogger();

        Set<String> namesSet = countss.keySet();
        for (String key : namesSet) {
            logger3.info(key); // имена
            logger3.info(String.valueOf(key + ": " + countss.get(key))); // имена и кол-во повторений

        }
        TreeMap<Integer, List<String>> countsSort = new TreeMap<>(); // метод для сортировки
        for (String it : countss.keySet()) {
            if (countsSort.containsKey(countss.get(it))) {
                countsSort.get(countss.get(it)).add(it);
            } else {
                List<String> list = new ArrayList<>();
                list.add(it);
                countsSort.put(countss.get(it), list);
            }
        }
        return countsSort.descendingMap(); // все пары в обратном порядке, только у TreeMap
    }
}

/*ArrayList <Integer> count = new ArrayList<>();
        int repit = 0;
        for (int i = 0; i < names.length - 1; i++) {
            if (names[i].equals(names[i + 1])) {
                repit += 1;
            }
            count.add(repit);
            repit = 0;
        }
        return count;*/
