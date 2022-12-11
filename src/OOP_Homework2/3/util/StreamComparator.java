package OOP_Homework2.util;

import OOP_Homework2.data.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream a1, Stream a2) {

        int i = a1.getStudyGroupList().size(), j = a2.getStudyGroupList().size();

        if (i > j) return 1;
        else if (i < j) return -1;
        else return 0;

    }
}