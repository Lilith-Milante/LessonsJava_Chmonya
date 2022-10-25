import java.util.*;
import java.util.logging.Logger;

//1. Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

public class Sem3 {
    public static void main(String[] args) {

        Logger l = Logger.getAnonymousLogger();
        l.info(String.valueOf(getList().toString()));

        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s4); // true
        System.out.println(s1 == s2);
        System.out.println(s1 == s5); // false ссылки ведут к разным объектам
        System.out.println(s1.equals(s5)); // true потому что сравнивает не по ссылкам

        changeTurn();
    }
    private static List<Integer> getList() {
        Random random = new Random();

        List list = new ArrayList<>();
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));

        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        return list;
    }

//2. Дан массив char[]. Необходимо в нем развернуть слова и вывести в консоль
    private static void changeTurn() {
        char[] initChar = {'м','а','м','а',' ','м','ы','л','а',' ','р','а','м','у'};
        String str = new String(initChar);
        String[] resArray = str.split(" ");
        System.out.printf(str);

        List<String> resultList = new ArrayList<>();
        for (int i = resArray.length - 1; i >= 0; i--) {
            resultList.add(resArray[i]);

        System.out.println(String.valueOf(resultList));
        }
    }

//3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
    private static void planetes() {

    }
}

//4. Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.