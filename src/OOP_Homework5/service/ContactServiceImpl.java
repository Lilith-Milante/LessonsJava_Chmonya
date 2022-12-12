package OOP_Homework5.service;

import OOP_Homework5.data.Contact;
import OOP_Homework5.data.Phone;
import OOP_Homework5.data.User;

import java.util.ArrayList;

public class ContactServiceImpl implements ContactService <User, Phone> {
    @Override
    public boolean isCorrect(User user, ArrayList <Phone> phones) {
        boolean isCorrect = true;
        if (user.getFirstName().contains("\\W") || user.getLastName().contains("\\W")) {
            isCorrect = false;
        }
        return isCorrect;
    }

    @Override
    public Contact createContact(User user, ArrayList<Phone> phones) {
        if (this.isCorrect(user, phones)) {
            Contact contact = new Contact(user);
            for (Phone i : phones) {
                contact.addPhone(i);
            } return contact;
        } return null;
    }
}
