package HW6.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Actions {
    public static void main(String[] args) {

        NoteBook dell = new NoteBook();
        dell.setRandomAccessMemory(16);
        dell.setHardWareCapacity(512);
        dell.setOperationSystem("Windows");
        dell.setColour("Black");

        NoteBook asus = new NoteBook();
        asus.setRandomAccessMemory(16);
        asus.setHardWareCapacity(128);
        asus.setOperationSystem("Windows");
        asus.setColour("Grey");

        NoteBook acer = new NoteBook();
        acer.setRandomAccessMemory(8);
        acer.setHardWareCapacity(512);
        acer.setOperationSystem("Windows");
        acer.setColour("White");

        NoteBook huawei = new NoteBook();
        huawei.setRandomAccessMemory(16);
        huawei.setHardWareCapacity(128);
        huawei.setOperationSystem("Linux");
        huawei.setColour("Black");

        ArrayList<NoteBook> noteBooksSet = new ArrayList<>(); // к множеству Set не может применить метод ниже

        noteBooksSet.add(dell);
        noteBooksSet.add(asus);
        noteBooksSet.add(acer);
        noteBooksSet.add(huawei);

        Logger logNote = Logger.getAnonymousLogger(); // печать критериев
        logNote.info(NoteBook.getRequest());

        NoteBook.filter(1, 16);
        NoteBook.filter(2, 512);

        var answer = NoteBook.getNoteBooks(noteBooksSet); // результат
        logNote.info(String.valueOf(answer));
    }
}
