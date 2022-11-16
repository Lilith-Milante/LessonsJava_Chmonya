package HW6;

/*. */

import java.util.*;
import java.util.logging.Logger;

public class Sem6 {
    public static void main(String[] args) {
        Set<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(2);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(3);

        Set<Integer> h2 = new LinkedHashSet<>(); // сохраняет порядок добавления
        h2.add(1);
        h2.add(2);
        h2.add(3);
        h2.add(2);
        h2.add(4);
        h2.add(5);
        h2.add(6);
        h2.add(3);

        TreeSet<Integer> h3 = new TreeSet<>();
        h3.add(1);
        h3.add(2);
        h3.add(3);
        h3.add(2);
        h3.add(4);
        h3.add(5);
        h3.add(6);
        h3.add(3);

        Logger log1 = Logger.getAnonymousLogger();
        log1.info(String.valueOf(h));
        log1.info(String.valueOf(h2));
        log1.info(String.valueOf(h3));

        Integer[] arr1 = createArray(1000, 0, 24);
        Logger log2 = Logger.getAnonymousLogger();

        log2.info(String.valueOf(percentUnic(arr1)));
        System.out.println(Arrays.toString(arr1));
        System.out.println(percentUnic(arr1));

        Cat();
    }

/* 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве*/
    public static Integer[] createArray(int size, int min, int max) {
        Random random = new Random();
        Integer[] arrayRandom = new Integer[size];

        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(min, max + 1);
        }
        return arrayRandom;
    }

    public static float percentUnic(Integer[] arrayRandom) {

        Set<Integer> setRandom = new HashSet<>(Arrays.asList(arrayRandom));
        return (float) setRandom.size() * 100 / arrayRandom.length;
    }

    public static void Cat() {
        Cat cat1 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat1.setCatMale('M');
        cat1.setMonthBirth(2);
        cat1.setYearBirth(2021);
        System.out.println(cat1);
        System.out.println(cat1.isMail());
    }
}
