package HW3;

import java.util.*;
import java.util.logging.Logger;

//2. Пусть дан произвольный список целых чисел, удалить из него четные числа

public class HomeWork3Task2 {
    public static void main(String[] args) {

        Logger log2 = Logger.getAnonymousLogger();
        log2.info(String.valueOf(deleteNums()));
    }

    private static List<Integer> deleteNums() {

        Random random = new Random();
        List list1 = new ArrayList<>();

        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));
        list1.add(random.nextInt(10));

        Logger log3 = Logger.getAnonymousLogger();
        log3.info(String.valueOf("Start list " + list1));

        List list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            Integer f = (Integer) list1.get(i);
            if (f % 2 != 0) {
                list2.add(f); // через метод remove не выходило удалять элементы из исходного списка
            }
        }
        return list2;
    }
}