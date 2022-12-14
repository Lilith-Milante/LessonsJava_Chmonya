package OOP_Homework2.data;

import java.util.List;

public class StudyGroup {

    private OOP_Homework2.data.Teacher teacher;
    private List<Student> studentsList;
    private int groupNumber;
    private static int number = 0; // для реализации groupNumber

    public StudyGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
        this.groupNumber = number;
        number++;
    }

    public StudyGroup() {
        this.groupNumber = ++number;
    }

    public StudyGroup(Boolean count) {
        if (count) {
            this.groupNumber = ++number;
        }
    }
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        StudyGroup.number = number;
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

    /*public void addStudents(Student student) { // добавление в лист
        studentsList.add(student);
    }*/

    @Override
    public String toString() {
        return String.format("This group: ", this.groupNumber, this.teacher.toString(), this.studentsList);
    }
}
