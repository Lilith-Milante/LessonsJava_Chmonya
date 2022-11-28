package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.data.User;

import java.util.ArrayList;
import java.util.Stack;

public class StudentController implements UserController{
    private Stack<Student> studentControllerSt = new Stack<>();
    @Override
    public void create(String name, String birthday, String info) {
        Student controlStudent = new Student(name, birthday, info);
        studentControllerSt.add(controlStudent);
    }

    @Override
    public Student get() {
        if (!studentControllerSt.isEmpty()) {
            return studentControllerSt.pop();
        }
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return new ArrayList<>(studentControllerSt);
    }
}
