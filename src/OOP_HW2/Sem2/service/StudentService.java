package OOP_HW2.Sem2.service;


import OOP_HW2.Sem2.data.Student;
import OOP_HW2.Sem2.data.User;
import OOP_HW2.Sem2.util.ReaderFromTxt;
import OOP_HW2.Sem2.util.WriterToTxt;

public class StudentService implements DataService {

    @Override
    public void create(User user) {
        if (user instanceof Student){
            WriterToTxt.write(user);
        }
        else System.out.println("Ошибка!");
    }

    @Override
    public User read(String fileName) {
        return ReaderFromTxt.read(fileName);
    }
}
