package Exc_Homework3;

/*Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
 Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
  Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
  При попытке вызвать add() у закрытого ресурса, должен выброситься IOException*/

import java.io.IOException;

public class Task2 {


    /*public class Counter implements AutoCloseable {
        private int count;
        private boolean flag;

        public Counter(int count) {
            this.count = count;
            flag = true;
        }

        public void add() throws IOException{
            if(!flag) {
                throw new IOException("closed");
            } ++count;
        }

        public int getCount() {
            return count;
        }

        public boolean isOpen() {
            return flag;
        }

        @Override
        public void close() throws RuntimeException {
            flag = false;
            System.out.println("closed!");
        }
    }

    public static void main(String[] args) {

        Counter counter = new Counter(0);
        System.out.println(counter.isOpen());
        try {
            counter.add();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
        try {
            counter.close();
            counter.add();
        } catch (IOException | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }*/
}
