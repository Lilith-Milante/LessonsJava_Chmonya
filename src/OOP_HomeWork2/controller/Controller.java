package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.service.StudyGroupServiceImpl;

import java.util.logging.Logger;

public class Controller {

    public Logger logStudy = Logger.getAnonymousLogger();

    public void controller() {

        StudyGroupServiceImpl sgs = new StudyGroupServiceImpl();

        logStudy.info(String.valueOf("Study Group1: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroupDone.txt")));
        logStudy.info(String.valueOf("Study Group2: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup2Done.txt")));
        logStudy.info(String.valueOf("Study Group3: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup3Done.txt")));
        logStudy.info(String.valueOf("Study Group4: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup4Done.txt")));
        logStudy.info("Number of groups : " + StudyGroup.getNumber());
    }
}