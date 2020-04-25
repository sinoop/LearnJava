package multithreading.threadmanagement.waitnotify;

import java.util.LinkedList;

public class ProducerConsumer {
    final int LIMIT = 10;
    LinkedList<Integer> list = new LinkedList<>();
    Object lock = new Object();
    int item = 0;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    lock.wait();
                }
                list.add(item++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }
                System.out.print("Cosuming ");
                int value = list.removeFirst();
                System.out.println(value + "; Size is " + list.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
