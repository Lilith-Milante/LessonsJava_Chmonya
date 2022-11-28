package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.data.User;

import java.util.List;

public interface StudyGroupController {
    void create(User teacher, List<User> studentList);

    StudyGroup get();
}