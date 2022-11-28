package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.data.User;

import java.util.ArrayList;

public interface UserController {
    void create(String name, String birthday, String info);
    Student get();
    ArrayList<User> getAll();
}
