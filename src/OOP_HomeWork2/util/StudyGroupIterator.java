package OOP_HomeWork2.util;

import OOP_HomeWork2.data.StudyGroup;
import OOP_HomeWork2.data.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<User> {
    private int index;
    private List<User> users;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.users = new ArrayList<>();
        this.users.add(studyGroup.getTeacher());
        this.users.addAll(studyGroup.getStudentsList());
    }

    @Override
    public boolean hasNext() {
        return this.index < users.size();
    }

    @Override
    public User next() {
        if (hasNext()) {
            return this.users.get(this.index++);
        }
        return null;
    }

    @Override
    public void remove() {
        this.users.remove(index);
    }
}