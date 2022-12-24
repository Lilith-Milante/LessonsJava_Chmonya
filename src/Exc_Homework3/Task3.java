package Exc_Homework3;

/*1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для пользователя сообщение об ошибке.

2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке.

3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {

    public static void main(String[] args) throws FileIsAbsenceEx{
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            throw new DivideException();
        }

        try {
            FileReader fileReader = new FileReader("filename.xxx");
        } catch (FileNotFoundException e) {
            throw new FileIsAbsenceEx("Not found(!)");
        }
    }

    public static class DivideException extends ArithmeticException {

        private String exMessage = "Error with divide by zero";

        public String getMessage() {
            return this.exMessage;
        }

        public DivideException() {
        }

        public DivideException(String s) {
            super(s);
        }
    }

    public static class FileIsAbsenceEx extends FileNotFoundException {

        private String exMessage = "FIle does not exist(!)";

        public String getMessage() {
            return this.exMessage;
        }

        public FileIsAbsenceEx(String exMessage) {
            this.exMessage = exMessage;
        }

        public FileIsAbsenceEx(String s, String exMessage) {
            super(s);
            this.exMessage = exMessage;
        }
    }
}
