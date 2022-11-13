package Lec6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d s:%d fn:%s ln:%s", id, salary, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

