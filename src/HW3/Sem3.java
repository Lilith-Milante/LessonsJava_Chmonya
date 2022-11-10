package HW3;

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
        planetes();
        hunting();
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
        char[] initChar = {'м', 'а', 'м', 'а', ' ', 'м', 'ы', 'л', 'а', ' ', 'р', 'а', 'м', 'у'};
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
    //Пройти по списку и удалить повторяющиеся элементы.
    private static void planetes() {
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Mars", "Mercury", "Saturn", "Uranus", "Mars", "Neptune"));
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < solarSystem.size(); i++) {
            int counter = 0;
            if (!resultList.contains(solarSystem.get(i))) {
                resultList.add(solarSystem.get(i));

                for (int j = 0; j < solarSystem.size(); j++) {
                    if (Objects.equals(solarSystem.get(i), solarSystem.get(j))) {
                        counter++;
                    }
                }
                System.out.println(String.format("%s - %d", solarSystem.get(i), counter));
            }
        }
        System.out.println(String.valueOf(solarSystem));
        System.out.println(String.valueOf(resultList));
    }

    //4. Создать список типа ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
    private static void hunting() {
        List huntList = new ArrayList<>();
        huntList.add("one");
        huntList.add(2);
        huntList.add(3);
        huntList.add("four");
        huntList.add("five");
        System.out.println(huntList);

        for (int i = 0; i < huntList.size(); i++) {
            if (huntList.get(i) instanceof Integer) {
                huntList.remove(i--); // работает, но неясно, почему
            }
        }
        System.out.println(huntList);
    }
}