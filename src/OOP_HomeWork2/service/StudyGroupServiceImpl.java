package OOP_HomeWork2.service;

import OOP_HomeWork2.data.Student;
import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.data.Teacher;
import OOP_HomeWork2.util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupServiceImpl implements DataService{ // реализуем метод из абстрактного класса (интерфейса)

    private StudyGroup studyGroup;
    @Override
    public void serviceToCreate(String file) {
        ReaderFromTxt reader = new ReaderFromTxt();
        String[] group = reader.read(file).split("\n");

        List<Student> students = new ArrayList<>();
        StudyGroup sg = new StudyGroup();
        for(String item : group) {
            String[] aux = item.split(" ");
            if(aux[0].equals("Teacher")) {
                sg.setTeacher(new Teacher(aux[1], aux[2], aux[3]));
            } else if(aux[0].equals("Student")) {
                students.add(new Student(aux[1], aux[2], Integer.parseInt(aux[3])));
            }
        }
        sg.setStudentsList(students);
        this.studyGroup = sg;
    }

    public StudyGroupServiceImpl(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyGroupServiceImpl() {
        this.studyGroup = new StudyGroup(false);
    }

    /*public void addStudentToList(Student student) {
        this.studyGroup.getStudentsList().add(student);
    }*/
}