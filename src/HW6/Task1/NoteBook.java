package HW6.Task1;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

import java.util.*;

public class NoteBook {

    static int randomAccessMemory;
    static int hardWareCapacity;
    String operationSystem;
    String colour;
    public static Map<Integer, Object> filterMap = new HashMap<>();
    private static Map<Integer, Object> noteMap = new HashMap<>(); // коллекция критериев

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
        noteMap.put(1, randomAccessMemory);
    }

    public void setHardWareCapacity(int hardWareCapacity) {
        this.hardWareCapacity = hardWareCapacity;
        noteMap.put(2, hardWareCapacity);
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        noteMap.put(3, operationSystem);
    }

    public void setColour(String colour) {
        this.colour = colour;
        noteMap.put(4, colour);
    }

    public static String getRequest() {
        System.out.println("Please, write your minimum system requirements such as: 1 - randomAccessMemory; 2 - hardWareCapacity; 3 - operationSystem; 4 - colour ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return "Please, write your minimum system requirements such as: 1 - randomAccessMemory; 2 - hardWareCapacity; 3 - operationSystem; 4 - colour";
    }

    public static void filter(int number, Object min) { // коллекция для фильтра
        filterMap.put(number, min);
    }

    public static Map<Integer, Object> getNoteBooks(ArrayList<NoteBook> laptops) {

        /*Map<Integer, Object> noteMap = new HashMap<>();

        noteMap.put(1, randomAccessMemory);
        noteMap.put(2, hardWareCapacity);
        noteMap.put(3, "operationSystem");
        noteMap.put(4, "colour");*/

        Map<Integer, Object> results = new HashMap<>();
        boolean t;

        for (NoteBook specifiaction : laptops) {
            for (int i = 0; i < noteMap.size(); i++) {
                t = true;
                for (Object j : filterMap.keySet()) {
                    if (noteMap.get(j) instanceof Integer) {
                        if ((Integer) specifiaction.noteMap.getOrDefault(j, 0) < (Integer) filterMap.getOrDefault(j, 0)) {
                            t = false;
                        }
                    }
                }
                if (t) {
                    results.put(1, specifiaction.noteMap);
                }
            }
        }
        return results;
    }
}