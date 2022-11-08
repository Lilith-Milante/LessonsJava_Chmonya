import java.util.*;
import java.util.logging.Logger;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

public class Sem4 {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();
        var start= System.nanoTime();
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            arrList.add(1);
        }
        logger.info(String.valueOf(System.nanoTime() - start));

        var startSecond = System.nanoTime();
        List<Integer> listt = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            listt.add(1);
        }
        logger.info(String.valueOf(System.nanoTime() - startSecond)); // оказався быстрее
        textNum();
        reverseString();
    }
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    private static void textNum() {

        List<String> smthList = new ArrayList<>();

        while (true) {
            Logger logger2 = Logger.getAnonymousLogger();
            var string = (new Scanner(System.in)).next();
            String[] resStr = string.split("~");
            if (!resStr[0].equals("print")) {
                for (int i = 0; i < Integer.parseInt(resStr[1]); i++) {
                    smthList.add(String.valueOf(resStr[0]));
                }
                logger2.info(String.valueOf(smthList));
            } else {
                logger2.info(String.valueOf(smthList.remove(Integer.parseInt(resStr[1])-1)));
                logger2.info(String.valueOf(smthList));
            }
        }
    }
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

    private static void reverseString() {
        List<String> smtList = new ArrayList<>();

        while (true) {
            Logger logger3 = Logger.getAnonymousLogger();

            var string = (new Scanner(System.in)).next();
            if (string.equals("print")) {
                Collections.reverse(smtList);
                logger3.info(smtList.toString());
                Collections.reverse(smtList);
            }
            else if (string.equals("revert")) {
                smtList.remove(smtList.size() - 1);
                logger3.info(smtList.toString());
            } else {
                smtList.add(string);
            }
        }
    }

}
