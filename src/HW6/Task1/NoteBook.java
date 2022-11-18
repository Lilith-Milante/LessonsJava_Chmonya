package HW6.Task1;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
3.1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

public class NoteBook {

    String randomAccessMemory;
    String hardWareCapacity;
    String operationSystem;
    String colour;

    public static void main(String[] args) {

        NoteBook dell = new NoteBook();
        dell.randomAccessMemory = "16 GB";
        dell.hardWareCapacity = "512 GB";
        dell.operationSystem = "Windows";
        dell.colour = "Black";

        NoteBook asus = new NoteBook();
        dell.randomAccessMemory = "16 GB";
        dell.hardWareCapacity = "128 GB";
        dell.operationSystem = "Windows";
        dell.colour = "Grey";

        NoteBook acer = new NoteBook();
        dell.randomAccessMemory = "8 GB";
        dell.hardWareCapacity = "512 GB";
        dell.operationSystem = "Windows";
        dell.colour = "White";

        NoteBook huawei = new NoteBook();
        dell.randomAccessMemory = "18 GB";
        dell.hardWareCapacity = "128 GB";
        dell.operationSystem = "Linux";
        dell.colour = "Black";

    }
}
