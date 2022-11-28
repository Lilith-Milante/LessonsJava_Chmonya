package OOP_HomeWork2.service;

import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StudentService implements UserService {
    private ArrayList<String> studentList;

    @Override
    public void create(Object object, String fileName) {
        Logger log1 = Logger.getAnonymousLogger();
        if (object instanceof Student user) {
            studentList.add(user.getClass().getSimpleName());
            studentList.add(user.getName());
            studentList.add(user.getBirthday());
            studentList.add(user.getStudentId());
        } else log1.info("Don't found");
    }

    @Override
    public Student read(String fileName) {
        studentList = ReaderFromTxt.read(fileName);
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equals(Student.class.getSimpleName())) {
                return new Student(studentList.get(++i), studentList.get(++i), studentList.get(++i));
            }
        }
        return null;
    }
}