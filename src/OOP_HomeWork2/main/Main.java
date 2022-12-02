package OOP_HomeWork2.main;

/*Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
        Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения Студентов и Преподавателя из файла TXT, создания класса УчебнаяГруппа и возвращения его
        Создать метод в Контроллере, в котором агрегируются юзеры
        Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
        Контроллер вызывает сервис, сервис вызывает util, util записывает в файловую систему
        Если класс описывает какой-то случай, который мы будем куда-то передавать, то это модель
        Если класс отвечает за обработку данных, но не сохраняет в БД или файловую систему, то это сервисный слой,
        Если классы отвечают за сохранение данных, то это репозитории/util
        Контроллер принимает данные*.
 */

import OOP_HomeWork2.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.controller();
    }
}

// итератор лучше добавлять в util