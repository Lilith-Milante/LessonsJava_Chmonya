package OOP_HomeWork2.Main;

/*Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
        Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения Студентов и Преподавателя из файла TXT, создания класса УчебнаяГруппа и возвращения его
        Создать метод в Контроллере, в котором агрегируются юзеры
        Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
        Контроллер вызывает сервис, сервис вызывает util, util записывает в файловую систему */

import OOP_HomeWork2.controller.StudentController;
import OOP_HomeWork2.controller.StudyGroupController;
import OOP_HomeWork2.controller.TeacherController;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        //Logger loggerStudy = Logger.getAnonymousLogger();

        StudentController studentController1 = new StudentController();

        studentController1.create("Egor", "22.11.2000","667");
        studentController1.create("Lilith", "29.12.2000","688");
        studentController1.create("Maria", "11.06.1996","698");
        studentController1.create("Sergey", "05.10.1998","677");
        studentController1.create("Anna", "06.09.1993","676");

        TeacherController teacherController1 = new TeacherController();

        teacherController1.create("Sergey", "11.07.1990","Astronomy");
        teacherController1.create("Emil", "17.08.1985","Geography");
        teacherController1.create("Emily", "12.07.1990","History");

        StudyGroupController studyGroupController1 = new StudyGroupController();
        studyGroupController1.create(TeacherController.get(),StudentController.getAll());

    }
}

