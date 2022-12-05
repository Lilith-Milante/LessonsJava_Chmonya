package OOP_HomeWork2.data;

public class Teacher extends User{

    private String subject;

    public Teacher(String name, String birthday, String subject) {
        super(name, birthday);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + super.getName() + "Birthday=" + super.getBirthday() +
                "subject='" + subject + '\'' +
                '}';
    }
}