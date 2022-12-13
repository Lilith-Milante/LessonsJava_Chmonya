package OOP_Homework5.controller;


import OOP_Homework5.data.Contact;
import OOP_Homework5.data.Phone;
import OOP_Homework5.data.Phonebook;
import OOP_Homework5.data.User;
import OOP_Homework5.service.ContactServiceImpl;
import OOP_Homework5.service.PhonebookService;
import OOP_Homework5.util.ReadFromConcole;
import OOP_Homework5.util.ReadFromJSON;
import OOP_Homework5.util.WriteToJSON;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Controller {
    public void controller() {

        /*String message = new ReadFromConcole().getMessage();
        List<String> list = (Arrays.stream(message.split(" ")).toList());
        System.out.println(list); - печать введённых данных */

        User user1 = new User("Anna", "Ivanova", "ITeco");
        User user2 = new User("Lilith", "Milante", "Cinecast");
        User user3 = new User("Cous", "Ty", "Tinkoff");
        User user4 = new User("Alex", "Tee","Cinecast");

        ArrayList<Phone> phones1 = new ArrayList<Phone>(); // тел книга для первого контакта
        phones1.add(new Phone("89 26 132 88 95"));
        phones1.add(new Phone("89 34 879 56 55"));
        phones1.add(new Phone("89 85 312 49 50"));

        ArrayList<Phone> phones2 = new ArrayList<Phone>();
        phones2.add(new Phone("89 34 879 56 55"));

        ArrayList<Phone> phones3 = new ArrayList<Phone>();
        phones3.add(new Phone("89 26 628 39 95"));

        ArrayList<Phone> phones4 = new ArrayList<Phone>();
        phones4.add(new Phone("89 26 490 39 65"));
        phones2.add(new Phone("89 26 132 55 49"));

        Contact cont1 = new ContactServiceImpl().createContact(user1, phones1); // создание контактов
        Contact cont2 = new ContactServiceImpl().createContact(user2, phones2);
        Contact cont3 = new ContactServiceImpl().createContact(user3, phones3);
        Contact cont4 = new ContactServiceImpl().createContact(user4, phones4);

        ArrayList<Contact> book = new ArrayList<>(); // добавление контактов в книгу
        book.add(cont1);
        book.add(cont2);
        book.add(cont3);
        book.add(cont4);

        Logger logPhoneBook = Logger.getAnonymousLogger();

        StringBuilder sb = new StringBuilder();

        Phonebook bookFirst = new PhonebookService().createPhonebook("BookFirst", book);
        for (Contact i: bookFirst.getContacts()){
            sb.append("\n" + i.toString());
        }

        logPhoneBook.info(sb.toString()); // запись в логгер

        //String pathFile2 = "D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_Homework5\\PhoneBook.csv";

        String pathFile = "D:\\Курс Разработчик\\II Четверть\\02 Java\\Lesson2\\Lesson2\\src\\OOP_Homework5\\PhoneBook.json";

        WriteToJSON jw = new WriteToJSON();
        jw.writeJson(jw.createJsonArray(bookFirst), pathFile);

        ReadFromJSON jsonReader = new ReadFromJSON();
        Phonebook bookSecondJs = jsonReader.readJson(pathFile);

        sb.setLength(0);

        for (Contact i: bookSecondJs.getContacts()){
            sb.append("\n" + i.toString());
        }
        logPhoneBook.info(sb.toString());
    }
}
