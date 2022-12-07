package OOP_Homework4.Planner.util;

import OOP_Homework4.Planner.data.Components;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ImportCSV {
    public void readCSV(Stack<E> activeTasks, String path) {
        BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);
        String info = br.readLine();

        while (info != null) {
            String[] elements = info.split(",");
            Components createTask = Components(Integer.parseInt(elements[0], elements[1], elements[2], elements[3], elements[4], elements[5], elements[6]));
        }
    }
}
