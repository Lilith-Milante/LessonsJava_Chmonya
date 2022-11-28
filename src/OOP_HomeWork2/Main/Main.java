package OOP_HomeWork2.Main;

/*Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
        Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения Студентов и Преподавателя из файла TXT, создания класса УчебнаяГруппа и возвращения его
        Создать метод в Контроллере, в котором агрегируются юзеры
        Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
        Контроллер вызывает сервис, сервис вызывает util, util записывает в файловую систему */

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        //Logger loggerStudy = Logger.getAnonymousLogger();

        StudentController1 studentController = new StudentController();

        studentController.create("Egor", "22.11.2000","667");
        studentController.create("Lilith", "29.12.2000","688");
        studentController.create("Maria", "11.06.1996","698");
        studentController.create("Sergey", "05.10.1998","677");
        studentController.create("Anna", "06.09.1993","676");

        TeacherController1 teacherController = new TeacherController();

        teacherController.create("Sergey", "11.07.1990","Astronomy");
        teacherController.create("Emil", "17.08.1985","Geography");
        teacherController.create("Emily", "12.07.1990","History");

        StudyGroupController studyGroupController = new StudyGroupController();
        studyGroupController.create(teacherController.get(),studentController.getAll());

    }
}

