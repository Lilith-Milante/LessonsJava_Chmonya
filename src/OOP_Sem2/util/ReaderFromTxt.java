package OOP_Sem2.util;

import OOP_Sem2.data.Student;
import OOP_Sem2.data.Teacher;
import OOP_Sem2.data.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReaderFromTxt {
    public static User read(String fileName){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                arrayList.add(line);
            }
            if(arrayList.get(0).contains("Teacher")){
                User user = new Teacher(arrayList.get(3),arrayList.get(1),arrayList.get(2));
                return user;
            }
            if (arrayList.get(0).contains("Student")){
                User user = new Student(arrayList.get(3),arrayList.get(1),arrayList.get(2));
                return user;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /*public static ArrayList<String> read(String fileName){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine(); // считывание строки
                if (!line.equals(" ")) {
                    arrayList.add(line);
                }
            }
            return arrayList;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;*/
}