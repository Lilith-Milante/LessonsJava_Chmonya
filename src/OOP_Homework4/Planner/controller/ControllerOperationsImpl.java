package OOP_Homework4.Planner.controller;

import OOP_Homework4.Planner.data.Components;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ControllerOperationsImpl extends Components implements Controller {

    private ArrayList<Components> activeTasks;
    private ArrayList<Components> archiveTasks;
    private String[] priority = {"Low", "Middle", "Urgent"};

    public ControllerOperationsImpl(String task, int id, String dateAdded, String timeAdded, String deadLine, String name, String priority, ArrayList<Components> activeTasks, ArrayList<Components> archiveTasks) {
        super(task, id, dateAdded, timeAdded, deadLine, name, priority);
        this.activeTasks = new ArrayList<>();
        this.archiveTasks = new ArrayList<>();
    }

    @Override
    public void createTask(String task, String name, String deadline, String priority) {
        this.activeTasks.add(Components(task, Components.number++, LocalDate.now().toString(), LocalTime.now().toString(), deadline, name, priority[priority]));
    }

    @Override
    public void removeTask(int id) {
        for (Components task : this.activeTasks) {
            if (task.setId(id)) {
                this.archiveTasks.add(task);
                this.activeTasks.remove(task);
                task.setPriority(task.getPriority() + "Completed!");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Components task : this.activeTasks) {
            sb.append(task.toString());
        } for (Components completed : this.archiveTasks) {
            sb.append(String.format("%s", completed.toString()));
        }
        return sb.toString();
    }
}
