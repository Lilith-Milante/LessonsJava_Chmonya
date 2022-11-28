package OOP_HomeWork2.service;

import OOP_HomeWork2.data.Teacher;
import OOP_HomeWork2.util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TeacherService implements UserService {

    private ArrayList<String> teacherList;
    @Override
    public void create(Object object, String fileName) {
        Logger log2 = Logger.getAnonymousLogger();
        if(object instanceof Teacher user) {
            teacherList.add(user.getClass().getSimpleName());
            teacherList.add(user.getDisciplesTaught());
            teacherList.add(user.getName());
            teacherList.add(user.getBirthday());
        } else log2.info("Don't found");
    }

    @Override
    public Object read(String fileName) {
        teacherList = ReaderFromTxt.read(fileName);
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).equals(Teacher.class.getSimpleName())) {
                return new Teacher(teacherList.get(++i), teacherList.get(++i), teacherList.get(++i));
            }
        }
        return null;
    }
}