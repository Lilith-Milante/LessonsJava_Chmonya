package OOP_Homework4.Planner.data;

import java.time.LocalDate;
import java.time.LocalTime;

public class Components {

    public static int number = 0;
    private int id;
    private String task;
    private String dateAdded;
    private String timeAdded;
    private String deadLine;
    private String name;
    private String priority;

    public Components(String task, int id, String dateAdded, String timeAdded, String deadLine, String name, String priority) {
        this.id = id;
        this.task = task;
        this.dateAdded = dateAdded;
        this.timeAdded = timeAdded;
        this.deadLine = deadLine;
        this.name = name;
        this.priority = priority;
        number++;
    }

    private Components() {
        this.id = number++;
        this.dateAdded = LocalDate.now().toString();
        this.timeAdded = LocalTime.now().toString();
    }

    private Components(String name) {
        this.id = number++;
        this.dateAdded = LocalDate.now().toString();
        this.timeAdded = LocalTime.now().toString();
        this.name = name;
    }
    private Components(String name, String deadLine) {
        this.id = number++;
        this.dateAdded = LocalDate.now().toString();
        this.timeAdded = LocalTime.now().toString();
        this.name = name;
        this.deadLine = deadLine;
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        this.id = id;
        return false;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Components{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", timeAdded='" + timeAdded + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}