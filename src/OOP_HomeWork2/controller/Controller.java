package OOP_HomeWork2.controller;

import OOP_HomeWork2.service.StudyGroupServiceImpl;

import java.util.logging.Logger;

public class Controller {

    public Logger logStudy = Logger.getAnonymousLogger();

    public void controller() {

        StudyGroupServiceImpl sgs = new StudyGroupServiceImpl();

        logStudy.info(String.valueOf("Study Group: " + sgs.serviceToCreate("StudyGroupDone.txt")));
    }
}