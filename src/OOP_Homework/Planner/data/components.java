package OOP_Homework.Planner.data;

public class components {

    private int id;
    private String dateAdded;
    private String timeAdded;
    private String deadLine;
    private String name;
    private String priority;

    public components(int id, String dateAdded, String timeAdded, String deadLine, String name, String priority) {
        this.id = id;
        this.dateAdded = dateAdded;
        this.timeAdded = timeAdded;
        this.deadLine = deadLine;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}