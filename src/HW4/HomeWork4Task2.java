package HW4;

// 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.logging.Logger;
import java.util.Queue;
import java.util.Deque; // сделала через методы deque, queue делает то же, только в более "ручном" режиме, как я поняла

public class HomeWork4Task2 {
    public static Deque<Integer> queueFirst = new LinkedList<Integer>();
    public static void main(String[] args) {
        //Queue<Integer> queueFirst = new LinkedList<Integer>();

        Logger log3 = Logger.getAnonymousLogger();
        log3.info(String.valueOf(enqueue(6)));

        Logger log2 = Logger.getAnonymousLogger();
        log2.info(String.valueOf(enqueue(7)));

        Logger log4 = Logger.getAnonymousLogger();
        log4.info(String.valueOf(dequeue()));

        Logger log5 = Logger.getAnonymousLogger();
        log5.info(String.valueOf(first()));

    }

    public static Deque<Integer> enqueue(int args) { // помещает элемент в конец очереди
        queueFirst.addLast(args);
        return queueFirst;
    }

    public static Deque<Integer> dequeue() { // возвращает первый элемент из очереди и удаляет его
        queueFirst.pollFirst();
        return queueFirst;
    }
    public static Deque<Integer> first() { // возвращает первый элемент из очереди, не удаляя его
        queueFirst.peekFirst();
        return queueFirst;
    }
}