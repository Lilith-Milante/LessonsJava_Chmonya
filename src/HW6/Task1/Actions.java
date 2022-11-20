package HW6.Task1;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Actions {
    public static void main(String[] args) {

        NoteBook dell = new NoteBook();
        dell.setRandomAccessMemory("16 GB");
        dell.setHardWareCapacity("512 GB");
        dell.setOperationSystem("Windows");
        dell.setColour("Black");

        NoteBook asus = new NoteBook();
        asus.setRandomAccessMemory("16 GB");
        asus.setHardWareCapacity("128 GB");
        asus.setOperationSystem("Windows");
        asus.setColour("Grey");

        NoteBook acer = new NoteBook();
        acer.setRandomAccessMemory("8 GB");
        acer.setHardWareCapacity("512 GB");
        acer.setOperationSystem("Windows");
        acer.setColour("White");

        NoteBook huawei = new NoteBook();
        huawei.setRandomAccessMemory("18 GB");
        huawei.setHardWareCapacity("128 GB");
        huawei.setOperationSystem("Linux");
        huawei.setColour("Black");

        Set<NoteBook> noteBooksSet = new HashSet<>();

        noteBooksSet.add(dell);
        noteBooksSet.add(asus);
        noteBooksSet.add(acer);
        noteBooksSet.add(huawei);

        Logger logNote = Logger.getAnonymousLogger(); // печать критериев
        logNote.info(NoteBook.getRequest());
    }
}
