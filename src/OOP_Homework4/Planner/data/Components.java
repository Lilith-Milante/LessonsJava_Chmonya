package OOP_Homework4.Planner.data;

import java.time.LocalDate;
import java.time.LocalTime;

public class Components {
    //private int priorityInt;
    private int id;
    private LocalTime createTime;
    private LocalDate createDate;
    private LocalDate deadLine;
    private String nameAutor;
    private Priority priority;


    enum Priority{ // модификатор перечисления
        Low, Middle, Immediate
    }

    public Components(int id, int priorityInt, String nameAutor, LocalTime createTime, LocalDate createDate) {
       this.id = id;
       this.createDate = createDate;
       this.createTime = createTime;
       this.nameAutor = nameAutor;

       switch (priorityInt) {
           case 1:
               this.priority = Priority.Low;
               this.deadLine = this.createDate.plusDays(14);
               break;

           case 2:
               this.priority = Priority.Middle;
               this.deadLine = this.createDate.plusDays(7);
               break;

           case 3:
               this.priority = Priority.Immediate;
               this.deadLine = this.createDate.plusDays(3);
               break;
       }
    }

    public Components(int id, int priorityInt, String nameAutor) {
        this(id, priorityInt, nameAutor, LocalTime.now(), LocalDate.now());
    }

    public int getId() {
        return id;
    }

    public LocalTime getCreateTime() {
        return createTime;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Components{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createDate=" + createDate +
                ", deadLine=" + deadLine +
                ", nameAutor='" + nameAutor + '\'' +
                ", priority=" + priority +
                '}';
    }
}