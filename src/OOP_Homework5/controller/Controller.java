package OOP_Homework5.controller;


import OOP_Homework5.util.ReadFromConcole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    public void controller() {

        String message = new ReadFromConcole().getMessage();
        List<String> list = (Arrays.stream(message.split(" ")).toList());
        System.out.println(list);
    }
}
