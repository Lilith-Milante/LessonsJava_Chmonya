package OOP_Homework4.Planner.util;

import OOP_Homework4.Planner.controller.ControllerOperationsImpl;
import OOP_Homework4.Planner.data.Components;

import java.util.ArrayList;
import java.util.List;

public class ExportCSV extends Components {
    public ExportCSV(String task, int id, String dateAdded, String timeAdded, String deadLine, String name, String priority) {
        super(task, id, dateAdded, timeAdded, deadLine, name, priority);
    }

    public void ExportTasks(ControllerOperationsImpl activeTasks, String path) {
        List<String[]> storage =  new ArrayList<>();
        String[] newTask = new String[7];
        String[] header = {"priority", "id", "content", "Who added", "When added", "when time added", "When deadline"};

        storage.add(header); // начало записи в файл
        for (Components task : activeTasks) {
            newTask[0] = task.priority;
            newTask[1] = tasks.id;
            newTask[2] = task.task;
            newTask[3] = task.name;
            newTask[4] = task.dateAdded.toString();
            newTask[5] = task.timeAdded.toString();
            newTask[6] = task.deadline; // разобраться что происходитб
        }
        storage.add(newTask);
        CSVWriter writer = new CSVWriter(new FileWriter(path));
        writer.write(storage);
    }
}

