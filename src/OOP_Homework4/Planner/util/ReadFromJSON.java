package OOP_Homework4.Planner.util;


import OOP_Homework4.Planner.data.Components;
import OOP_Homework4.Planner.service.PlannerService;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFromJSON {
    public PlannerService readJson(String pathFile) {
        PlannerService plannerDone = new PlannerService();

        try (FileReader reader = new FileReader(pathFile)) {
            Scanner scanner = new Scanner(reader);
            JSONParser parser = new JSONParser();
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                JSONObject object = (JSONObject) parser.parse(line);
                plannerDone.addTask(JsonTask);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } return plannerDone;
    }

    public Components JsonTask(JSONObject line) {
        Integer priorityInt = 1;
        switch (line.get("priority").toString()) {
            case "Low":
                priorityInt = 1;
                break;

            case "Middle":
                priorityInt = 2;
                break;

            case "Immediate":
                priorityInt = 3;
                break;
        } return new Components(Integer.parseInt(line.get("id").toString()), priorityInt, line.get("firstNameAutor").toString(),
                LocalDate.parse(line.get("createDate").toString()),
                LocalTime.parse(line.get("createTime").toString()));
    }

}

