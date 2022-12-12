package OOP_Homework5.data;

import java.util.ArrayList;

public class Phonebook {

    private String name;
    private ArrayList<Contact> contacts;

    public Phonebook(String name) {
        this.name = name;
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) { //принимаем наш список контактов
        this.contacts.add(contact);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return this.contacts.toString();
    }
}
