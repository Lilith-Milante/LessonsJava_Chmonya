package OOP_HomeWork2.data;

import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentsList;
    private int groupNumber;
    private int number; // для реализации groupNumber

    public StudyGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
        this.groupNumber = number;
    }

    public StudyGroup() {
        this.groupNumber = number;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudents(Student student) { // добавление в лист
        studentsList.add(student);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}
