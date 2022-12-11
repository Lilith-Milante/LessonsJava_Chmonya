package OOP_Homework4.Planner.service;

import OOP_Homework4.Planner.data.Components;

import java.util.ArrayList;

public class PlannerService {
    public ArrayList<Components> tasksList;

    public PlannerService() {
        tasksList = new ArrayList<>();
    }

    public void addTask(Components components) {
        this.tasksList.add(components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Components i : this.tasksList) {
            sb.append(i + "\n");
        }
        return sb.toString();
    }
}
