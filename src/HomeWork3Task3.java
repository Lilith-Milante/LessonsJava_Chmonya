import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class HomeWork3Task3 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(List.of(2, 9, 5, 0, 7, 6));
        System.out.println(l);
        countMaxMin(l);

        Logger log3 = Logger.getLogger(HomeWork3Task3.class.getName());
        log3.log(Level.INFO, "Done");
        Logger log = Logger.getAnonymousLogger();
        for (int i: l) {
            log.info(i + " ");
        }

        Logger log4 = Logger.getLogger(HomeWork3Task1.class.getName());
        log4.log(Level.INFO, "max in this list - , min - , average - ");
    }

    public static void countMaxMin(List<Integer> a) {
        int max = a.get(0);
        int min = a.get(0);
        int sum = 0;
        for (int i : a) {
            sum += i;
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        float avg = (float) sum / (float) a.size();
    }
}