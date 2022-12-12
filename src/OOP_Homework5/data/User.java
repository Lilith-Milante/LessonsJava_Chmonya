package OOP_Homework5.data;

import java.util.Objects;

public class User {

    private String firstName;
    private String lastName;
    private String company;

    public User(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // мы сравниваем два объекта одного класса
                                     //это не один и тот же объект
                                     //мы сравниваем наш объект не c null
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) && Objects.equals(lastName, user.lastName)
                && Objects.equals(company, user.company);
    }

    @Override
    public int hashCode() { // сравниваем объекты побыстрее, а затем в equals
        return Objects.hash(firstName, lastName, company);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
