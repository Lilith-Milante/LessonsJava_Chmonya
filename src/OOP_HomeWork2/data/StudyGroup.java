package OOP_HomeWork2.data;

import java.util.List;

public class StudyGroup {

    private Teacher studyTeacher;
    private List<Student> students;


    public StudyGroup(Teacher teacher, List<Student> students) {
        this.studyTeacher = studyTeacher;
        this.students = students;
    }

    public StudyGroup() {

    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public Teacher getStudyTeacher() {
        return studyTeacher;
    }

    public void setStudyTeacher(Teacher studyTeacher) {
        this.studyTeacher = studyTeacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "studyTeacher=" + studyTeacher +
                ", students=" + students +
                '}';
    }
}