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

/* 2. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
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

/*3. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
Создайте метод **public boolean** equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/
    public static void Cat() {
        Cat cat1 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat1.setCatMale('M');
        cat1.setMonthBirth(2);
        cat1.setYearBirth(2021);

        Cat cat2 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat2.setCatMale('M');
        cat2.setMonthBirth(2);
        cat2.setYearBirth(2021);

        Cat cat3 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat3.setCatMale('M');
        cat3.setMonthBirth(2);
        cat3.setYearBirth(2021);

        Cat cat4 = new Cat("Murzik", new CatOwner("Petr Ivanov"));
        cat4.setCatMale('M');
        cat4.setMonthBirth(4);
        cat4.setYearBirth(2015);

        Cat cat5 = new Cat("Musya", new CatOwner("Lena Petrova"));
        cat5.setCatMale('F');
        cat5.setMonthBirth(5);
        cat5.setYearBirth(2019);

        Set<Cat> catSet = new HashSet<>(); // создали своё множество на основании класса

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);

        for (Cat i : catSet) {
            System.out.println(i);
        }
        System.out.println(catSet);
    }
}