package HW4;

// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class HomeWork4Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> startList = new LinkedList<>();

        startList.add(1);
        startList.add(2);
        startList.add(3);
        startList.add(4);
        startList.add(5);
        startList.add(6);

        Logger log1 = Logger.getAnonymousLogger();
        log1.info(String.valueOf("Start linkedList: " + startList));
        reverseList(startList);
    }

    private static LinkedList<Integer> reverseList (List<Integer> startList) {
        LinkedList<Integer> finalList = new LinkedList<>();

        for (int i = 0; i < startList.size(); i++) {
            finalList.add(startList.size() - i - 1);
        }

        Logger log2 = Logger.getAnonymousLogger();
        log2.info(String.valueOf("Reversed linkedList: " + finalList));

        return finalList;
    }
}