package OOP_Homework2.data;

public class Student extends User {

    private int studentsId;

    public Student(String name, String birthday, int studentsId) {
        super(name, birthday);
        this.studentsId = studentsId;
    }


    public int getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(int studentsId) {
        this.studentsId = studentsId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name=" + super.getName() +
                "Birthday=" + super.getBirthday() +
                "studentId='" + studentsId + '\'' +
                '}';
    }
}
