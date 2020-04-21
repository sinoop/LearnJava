package learning.com.serializable;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> a = new ArrayList<>();
        Person p = new Person("Sinoop");
        Person x = new Person("Anish");
        WeakReference<Person> b = new WeakReference<>(new Person("Siva"));

        System.gc();

//        Thread.sleep(10000);
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        Long val = new Long("4321");

    }

}


class Person implements Serializable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleaned " + this.name);
        super.finalize();
    }
}
