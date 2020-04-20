package designpatterns.singleton.firstImplementation;

import java.util.Random;

public class ThreadClient implements Runnable{
    FirstImplementation instanceVariable;

    public ThreadClient(FirstImplementation instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(Thread.currentThread().getName() + " " + FirstImplementation.getInstance().hashCode());
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - Finished" );
    }
}
