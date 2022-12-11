package OOP_Homework4.Planner.util;


import OOP_Homework4.Planner.service.PlannerService;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public static void write(PlannerService plannerService, String pathFile) {
        try (FileWriter writer = new FileWriter(pathFile, false)) {
            for (int i = 0; i < plannerService.tasksList.size(); i++) {
                writer.write(plannerService.tasksList.get(i).toString() + "\n");
            } writer.close();
        } catch (IOException e) {
            e.printStackTrace();
    }
    }
}
