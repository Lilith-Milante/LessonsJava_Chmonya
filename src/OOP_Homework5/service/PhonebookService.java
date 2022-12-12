package OOP_Homework5.service;

import OOP_Homework5.data.Contact;
import OOP_Homework5.data.Phonebook;

import java.util.ArrayList;

public class PhonebookService {

    public boolean isExists(ArrayList<Contact> contacts, Contact contact) {
        return (contacts.contains(contact));
    }

    public Phonebook createPhonebook(String name, ArrayList<Contact> contacts) {
        Phonebook phonebook = new Phonebook(name);
        for (Contact i : contacts) {
            if (!isExists(phonebook.getContacts(), i)) { //если контакта не существует, вносим его в телефонную книгу
                phonebook.addContact(i);
            }
        } return phonebook;
    }
}
