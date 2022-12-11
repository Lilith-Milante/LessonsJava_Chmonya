package OOP_Homework4.Planner.util;


import OOP_Homework4.Planner.data.Components;
import OOP_Homework4.Planner.service.PlannerService;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromTxt {
    public static PlannerService read (String pathName) {
        PlannerService readFile = new PlannerService();
        try (FileReader reader = new FileReader(pathName)) {
            Scanner sc = new Scanner(reader);
            ArrayList<String> lines = new ArrayList<>();
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            } for (String i : lines) {
                int id = Integer.parseInt(i.substring(i.indexOf("=")+ 1, i.indexOf(",")));
                i = i.substring(i.indexOf(",")+1);
                LocalDate createDate = LocalDate.parse(i.substring(i.indexOf("=")+1, i.indexOf(",")));
                i = i.substring(i.indexOf(",")+1);
                LocalTime createTime = LocalTime.parse(i.substring(i.indexOf("=")+1, i.indexOf(",")));
                i = i.substring(i.indexOf(",")+1);
                LocalDate deadline = LocalDate.parse(i.substring(i.indexOf("=")+1, i.indexOf(",")));
                i = i.substring(i.indexOf(",")+1);
                String autorName = i.substring(i.indexOf("=")+2, i.indexOf(",")-1);
                i = i.substring(i.indexOf(",")+1);
                String priorityString = i.substring(i.indexOf("=")+1, i.indexOf("}"));
                int priorityInt = 1;
                switch (priorityString){
                    case "Low":
                        priorityInt = 1;
                        break;
                    case "Medium":
                        priorityInt = 2;
                        break;
                    case "Immediately":
                        priorityInt = 3;
                        break;
                }
                Components test = new Components(id, priorityInt, autorName, createDate, createTime);
                readFile.addTask(test);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } return readFile;
    }
}

