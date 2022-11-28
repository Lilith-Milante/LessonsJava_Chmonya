package OOP_HomeWork2.service;

public interface UserService {
    void create(Object object,String fileName); // принимаем объект и строку с файлом на запись
    Object read(String fileName); // принимаем объект и строку с файлом на чтение
}
