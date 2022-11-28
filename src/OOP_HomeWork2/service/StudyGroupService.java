package OOP_HomeWork2.service;


import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.data.Teacher;
import OOP_HomeWork2.util.ReaderFromTxt;
import OOP_HomeWork2.util.WriterToTxt;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StudyGroupService implements UserService {

    private ArrayList<String> studyGroupList;
    private UserService studentService = new StudentService(); // экземпляры классов сервиса студентов и учителей
    private UserService teacherService = new TeacherService();

    public void create(Object object, String fileName) {
        Logger log3 = Logger.getAnonymousLogger();

        if (object instanceof StudyGroup studyGroup) {
            studyGroupList.add(studyGroup.getClass().getSimpleName());

            WriterToTxt.write(studyGroupList, fileName);
            teacherService.create(studyGroup.getStudyTeacher(), fileName);

            ArrayList<Student> listStudents = new ArrayList<>(studyGroup.getStudents());
            for (int i = 0; i < studyGroup.getStudents().size(); i++) {
                studentService.create(listStudents.get(i), fileName);
            }
            //tempList = new ArrayList<>();
            //tempList.add("}");
            WriterToTxt.write(studyGroupList, fileName);

        } else log3.info("Don't found");
    }

    @Override
    public StudyGroup read(String fileName) {
        studyGroupList = ReaderFromTxt.read(fileName);
            StudyGroup studyGroup = new StudyGroup();
            for (int i = 0; i < studyGroupList.size(); i++) {
                if (studyGroupList.get(i).equals(Teacher.class.getSimpleName())) {
                    Teacher teacher = new Teacher(studyGroupList.get(++i), studyGroupList.get(++i), studyGroupList.get(++i));

                }else if (studyGroupList.get(i).equals(Student.class.getSimpleName())){
                    studyGroup.addStudents(new Student(studyGroupList.get(++i), studyGroupList.get(++i), studyGroupList.get(++i)));
                }
            }
            return studyGroup;
        }
    }
