package OOP_HW2.Sem2.service;

import OOP_HW2.Sem2.data.User;

public interface DataService {
    void create(User user);
    User read(String fileName);
}