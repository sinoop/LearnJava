package multithreading.threadmanagement.waitnotify;

public class MainProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer p = new ProducerConsumer();
        Thread t1 = new Thread(() -> {
            try {
                p.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                p.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
