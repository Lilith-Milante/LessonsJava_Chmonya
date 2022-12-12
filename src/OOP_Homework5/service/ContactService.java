package OOP_Homework5.service;

import OOP_Homework5.data.Contact;
import OOP_Homework5.data.Phone;
import OOP_Homework5.data.User;

import java.util.ArrayList;

public interface ContactService <T extends User, E extends Phone> {

    public boolean isCorrect(T user, ArrayList<E> phones);
    public Contact createContact(T user, ArrayList<E> phones);
}
