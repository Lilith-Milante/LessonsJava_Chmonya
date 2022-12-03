package OOP_HomeWork2.service;

import OOP_HomeWork2.data.Stream;
import OOP_HomeWork2.util.StreamComparator;

import java.util.List;

public class StreamService {

    public void sortStreamList(List<Stream> streamList) {
        streamList.sort(new StreamComparator());
    }
}