import java.io.File;

// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
/* 1 Расширение файла: txt

2 Расширение файла: pdf

3 Расширение файла:

4 Расширение файла: jpg */

public class HomeWork2Task2 {

    public static void main(String[] args) {

        File file1 = new File("D:/Курс Разработчик/II Четверть/02 Java/Lesson2/Lesson2/src/logsSort.txt"); // txt
        System.out.println("File extension: " + findExtension(file1));

        File file2 = new File("D:/Курс Разработчик/II Четверть/02 Java/Лекции/03 Коллекции JAVA_ Введение.pdf"); // pdf
        System.out.println("File extension: " + findExtension(file2));

        File file3 = new File("D:/Курс Разработчик/II Четверть/02 Java/Lesson2"); // without extension, folder
        System.out.println("File extension: " + findExtension(file3));

        File file4 = new File("D:/Курс Разработчик/II Четверть/02 Java/cupOfJava.jpg"); // jpg
        System.out.println("File extension: " + findExtension(file4));
    }

    private static String findExtension(File file) {
        String filename = file.getName();
        if (filename.lastIndexOf(".") != -1 && filename.lastIndexOf(".") != 0) {
            return filename.substring(filename.lastIndexOf(".") + 1); // substring вырезает часть строки
        } else {
            return "";
        }
    }
}