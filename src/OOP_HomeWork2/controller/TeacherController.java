package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.Teacher;
import OOP_HomeWork2.data.User;

import java.util.ArrayList;
import java.util.Stack;

public class TeacherController implements UserController{

    private Stack<Teacher> teacherControlSt = new Stack<>();

    @Override
    public void create(String name, String birthday, String info) {
        Teacher controlStudent = new Teacher(name, birthday, info);
        teacherControlSt.push(controlStudent);
    }

    @Override
    public User get() {
        if (!teacherControlSt.isEmpty()) {
            return teacherControlSt.pop();
        }
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return new ArrayList<>(teacherControlSt);
    }
}
