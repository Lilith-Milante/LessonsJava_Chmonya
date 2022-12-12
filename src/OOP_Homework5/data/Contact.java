package OOP_Homework5.data;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {

    private User user;
    private ArrayList<Phone> phones;

    public Contact(User user) {
        this.user = user;
        phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) { //принимаем наш лист
        this.phones.add(phone);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(user, contact.user) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, phones);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "user=" + user +
                ", phones=" + phones +
                '}';
    }
}
