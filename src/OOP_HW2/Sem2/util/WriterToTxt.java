package OOP_HW2.Sem2.util;


import OOP_HW2.Sem2.data.Student;
import OOP_HW2.Sem2.data.Teacher;
import OOP_HW2.Sem2.data.User;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterToTxt {
    public static void write(User user) {
        try (PrintWriter printWriter = new PrintWriter("user.txt")) {
            String className = user.getClass().getSimpleName();
            printWriter.write(className + "\n");
            printWriter.write(user.getName() +"\n");
            printWriter.write(user.getBirthday() +"\n");
            if (className.equals("Student")){
                Student temp = (Student) user;
                printWriter.write(temp.getStudentId()+"\n");
            }
            if (className.equals("Teacher")){
                Teacher temp = (Teacher) user;
                printWriter.write(temp.getDisciplesTaught() +"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*public class WriterToTxt { // (не исп)
    public static void write(ArrayList<String> list, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName,true)) { // для записи в файл
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i) + "\n");
            }
        } catch (Exception e) {
            System.out.println("File is not found");
        }
    }
}*/