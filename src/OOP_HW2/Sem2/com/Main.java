package OOP_HW2.Sem2.com;

import OOP_HW2.Sem2.data.Student;
import OOP_HW2.Sem2.data.Teacher;
import OOP_HW2.Sem2.data.User;
import OOP_HW2.Sem2.service.DataService;
import OOP_HW2.Sem2.service.StudentService;
import OOP_HW2.Sem2.util.ReaderFromTxt;
import OOP_HW2.Sem2.util.WriterToTxt;


import java.util.logging.Logger;

public class Main {

//    . Реализовать абстрактный класс User и его наследники Student и Teacher.
//    Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
//    а наследники собственные параметры (какие, по выбору преподавателя –
//    Пример: studentId для Student, disciplesTaught для Teacher).

//    1. Создать package – util. Работу продолжаем в нем
//  2. Создать классы WriterToTxt и ReaderFromTxt
//  имеющие статичные методы для записи/чтения в/из txt файла

//    1. Создать package – service. Работу продолжаем в нем
//2. Создать интерфейс DataService описывающий реализацию
// конкретных сервисов по управлению сущностями (create, read)
//3. Создать для сущности Student отдельный Service реализующий
// интерфейс DataService. Create и read операции реализуются путем вызова utils методов



    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        User teacher = new Teacher("Математика","Иван", "20.06.1984");
        User student = new Student("012","Иван", "20.06.1984");
        logger.info(teacher.toString());
        logger.info(student.toString());
        WriterToTxt.write(teacher);
        logger.info(ReaderFromTxt.read("user.txt").toString());
        DataService dataService = new StudentService();
        dataService.create(student);
        dataService.create(teacher);
    }
}
