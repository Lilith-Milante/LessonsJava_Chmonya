package OOP_Homework4.Planner.controller;

public interface Controller {

    public void createTask(String task, String name, String deadline, String priority);

    public void removeTask(int id);
}
