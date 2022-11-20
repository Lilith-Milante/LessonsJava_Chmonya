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
        huawei.setRandomAccessMemory(18);
        huawei.setHardWareCapacity(128);
        huawei.setOperationSystem("Linux");
        huawei.setColour("Black");

        Set<NoteBook> noteBooksSet = new HashSet<>();

        noteBooksSet.add(dell);
        noteBooksSet.add(asus);
        noteBooksSet.add(acer);
        noteBooksSet.add(huawei);

        Logger logNote = Logger.getAnonymousLogger(); // печать критериев
        logNote.info(NoteBook.getRequest());

        var answer = NoteBook.getNoteBooks((ArrayList<NoteBook>) noteBooksSet); // результат
        logNote.info(String.valueOf(answer));

        NoteBook.filter(1, 8);
    }
}
