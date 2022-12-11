package OOP_Homework4.Planner.controller;

import OOP_Homework4.Planner.data.Components;
import OOP_Homework4.Planner.service.PlannerService;
import OOP_Homework4.Planner.util.ReadFromTxt;
import OOP_Homework4.Planner.util.WriteToTxt;

import java.util.logging.Logger;

public class Controller {

    public static void controller() {
        Logger logPlanner = Logger.getAnonymousLogger();
        Components data1 = new Components(2, 3, "Tomas Wayne");
        Components data2 = new Components(3, 2, "Marta Kane");
        Components data3 = new Components(4, 1, "Alfred Pennyworth");

        PlannerService plannerService1 = new PlannerService();
        plannerService1.addTask(data1);
        plannerService1.addTask(data2);
        plannerService1.addTask(data3);

        logPlanner.info("\n" + plannerService1.toString());
        new WriteToTxt().write(plannerService1, "Planner.txt");
        logPlanner.info("\n" + new ReadFromTxt().read("Planner.txt").toString());

    }

}
