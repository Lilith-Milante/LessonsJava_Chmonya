package OOP_Sem2.service;

import OOP_Sem2.data.User;

public interface DataService {
    void create(User user);
    User read(String fileName);
}