package OOP_Homework2.service;

import OOP_Homework2.data.Stream;
import OOP_Homework2.util.StreamComparator;

import java.util.List;

public class StreamService {

    public void sortStreamList(List<Stream> streamList) {
        streamList.sort(new StreamComparator());
    }
}