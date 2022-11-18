package HW6.Task1;

public class Notebooks {
    public static void NoteBooks() {

        NoteBook dell = new NoteBook();
        dell.setRandomAccessMemory("16 GB");
        dell.setHardWareCapacity("512 GB");
        dell.setOperationSystem ("Windows");
        dell.setColour("Black");

        NoteBook asus = new NoteBook();
        dell.setRandomAccessMemory("16 GB");
        dell.setHardWareCapacity("128 GB");
        dell.setOperationSystem("Windows");
        dell.setColour("Grey");

        NoteBook acer = new NoteBook();
        dell.setRandomAccessMemory("8 GB");
        dell.setHardWareCapacity("512 GB");
        dell.setOperationSystem("Windows");
        dell.setColour("White");

        NoteBook huawei = new NoteBook();
        dell.setRandomAccessMemory("18 GB");
        dell.setHardWareCapacity("128 GB");
        dell.setOperationSystem("Linux");
        dell.setColour("Black");
    }
}
