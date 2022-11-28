package OOP_HomeWork2.controller;

import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.data.User;

import java.util.List;
import java.util.Stack;

public class StudyGroupControllerTwo implements StudyGroupController {

    private Stack<StudyGroup> studyGroupSt = new Stack<>();

    @Override
    public void create(User teacher, List<User> studentList) {

        StudyGroup controlStudyGroup = new StudyGroup();
        TeacherController teacherController = new TeacherController();

        //controlStudyGroup.changeTeacher((Teacher) teacherController.get());
        for (var student : studentList) {
            controlStudyGroup.addStudents((Student) student);
        }
    }

    @Override
    public StudyGroup get() {
        if (studyGroupSt.size() > 0) {
            return studyGroupSt.pop();
        }
        return null;
    }
}
