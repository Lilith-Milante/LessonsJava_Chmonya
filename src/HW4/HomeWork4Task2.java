package HW4;

//2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.logging.Logger;

public class Queue {
    public static void main(String[] args) {
        LinkedList<Integer> linkedTwo = new LinkedList<>(5);

        Logger log3 = Logger.getAnonymousLogger();
        log3.info();

        enqueue();
        dequeue();
        first();
    }

    public static int enqueue() {

    }
    public static int dequeue() {

    }
    public static int first() {

    }
}
