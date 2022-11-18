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

import java.util.HashMap;
import java.util.Map;

public class NoteBook {

    String randomAccessMemory;
    String hardWareCapacity;
    String operationSystem;
    String colour;

    public void setRandomAccessMemory(String randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public void setHardWareCapacity(String hardWareCapacity) {
        this.hardWareCapacity = hardWareCapacity;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void criterions() {
        System.out.println("Please, write your minimum system requirements such as: 1 - randomAccessMemory; 2 - hardWareCapacity; 3 - operationSystem; 4 - colour");
    }

    public Map<Integer, String> getNoteMap() { // для хранения критериев
        Map<Integer, String> noteMap = new HashMap<>();

        noteMap.put(1, "randomAccessMemory");
        noteMap.put(2, "hardWareCapacity");
        noteMap.put(3, "operationSystem");
        noteMap.put(4, "colour");

        return noteMap;
    }
}
