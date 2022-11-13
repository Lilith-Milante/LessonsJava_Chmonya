package Lec6;

import java.util.Arrays;
import java.util.HashSet;

public class Ex001 {

    public static void main(String[] args) {
        // region

        Worker w1 = new Worker();
        w1.id = 1000;
        w1.salary = 45000;
        w1.firstName = "Name1";
        w1.lastName = "LastName";

        Worker w2 = new Worker();
        w2.id = 1000;
        w2.salary = 45000;
        w2.firstName = "Name1";
        w2.lastName = "LastName";

        Worker w3 = new Worker();
        w3.id = 2000;
        w3.salary = 45500;
        w3.firstName = "Name1";
        w3.lastName = "LastName";

        Worker w4 = new Worker();
        w4.id = 2000;
        w4.salary = 45500;
        w4.firstName = "Name1";
        w4.lastName = "LastName";

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3); // выводится странно
        System.out.println(w4); // печатает разные хэши, это разные объекты

        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}
