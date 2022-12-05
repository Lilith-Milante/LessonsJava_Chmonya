package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.Stream;
import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.service.StreamService;
import OOP_HomeWork2.service.StudyGroupServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Controller {

    static Logger logStudy = Logger.getAnonymousLogger();

    public void controller() {

        StudyGroupServiceImpl sgs = new StudyGroupServiceImpl();

        //logStudy.info(String.valueOf("Study Group1: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroupDone.txt")));
        //logStudy.info(String.valueOf("Study Group2: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup2Done.txt")));
        //logStudy.info(String.valueOf("Study Group3: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup3Done.txt")));
        //logStudy.info(String.valueOf("Study Group4: " + sgs.serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup4Done.txt")));
        logStudy.info("Number of groups : " + StudyGroup.getNumber());

        StudyGroup stg1 = serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroupDone.txt", sgs);
        StudyGroup stg2 = serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup2Done.txt", sgs);
        StudyGroup stg3 = serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup3Done.txt", sgs);
        StudyGroup stg4 = serviceToCreate("D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_HomeWork2\\controller\\StudyGroup4Done.txt", sgs);

        logStudy.info("Number of groups : " + StudyGroup.getNumber());

        List<StudyGroup> groupList1 = new ArrayList<>(Arrays.asList(stg1, stg2));
        List<StudyGroup> groupList2 = new ArrayList<>(Arrays.asList(stg3, stg4));

        Stream streamStudy1 = new Stream(groupList1);
        for (StudyGroup group : streamStudy1) {
            logStudy.info("Stream1: " + group.toString());
        }
        Stream streamStudy2 = new Stream(groupList2);

        logStudy.info(String.format("In first stream %d groups, in second stream %d groups", streamStudy1.getStudyGroupList().size(),
                streamStudy2.getStudyGroupList().size()));


        List<Stream> streamList = new ArrayList<>(Arrays.asList(streamStudy1, streamStudy2));
        logStudy.info("First list of streams: " + streamList.get(0) + streamList.get(1));

        StreamService streamService1 = new StreamService();
        streamService1.sortStreamList(streamList);

        logStudy.info("Sort list of streams: " + streamList.get(0) + streamList.get(1));
    }

    public StudyGroup serviceToCreate(String file, StudyGroupServiceImpl studyGroupService) { // для срабатывания метода по созданию групп
        studyGroupService.serviceToCreate(file);
        StudyGroup group = studyGroupService.getStudyGroup();
        logStudy.info("Created group: " + group.toString());
        return group;
    }
}