package learning.com.serializable;

import java.io.*;
import java.util.HashMap;

public class HashMapHashCode {
    /*

//        m.put("1", "Anish");
//        m.put("2", "Sinoop");
//        m.put("3", "Siva");

1HashMap hashcode : -1752403044
1 --> Anish
49 --> 63410449
2 --> Sinoop
50 --> -1818390824
3 --> Siva
51 --> 2577313

 New HashMap hashcode : -1752403044
1 --> Anish
49 --> 63410449
2 --> Sinoop
50 --> -1818390824
3 --> Siva
51 --> 2577313


m.put("1", new Person("Anish"));
m.put("2", new Person("Sinoop"));
m.put("3", new Person("Siva"));

HashMap hashcode : -1607915897
1 --> learning.com.main.java.serializable.Person@17550481
49 --> 391447681
2 --> learning.com.main.java.serializable.Person@97e1986
50 --> 159259014
3 --> learning.com.main.java.serializable.Person@7f560810
51 --> 2136344592

 New HashMap hashcode : -1072917036
1 --> learning.com.main.java.serializable.Person@28d25987
49 --> 684874119
2 --> learning.com.main.java.serializable.Person@4501b7af
50 --> 1157740463
3 --> learning.com.main.java.serializable.Person@523884b2
51 --> 1379435698
*/
    public static void main(String[] args) {
        HashMap<String, Person> m = new HashMap<>();
        m.put("1", new Person("Anish"));
        m.put("2", new Person("Sinoop"));
        m.put("3", new Person("Siva"));

        HashMap<String, Person> m2 = new HashMap<>();
        m2.put("1", new Person("Anish"));
        m2.put("2", new Person("Sinoop"));
        m2.put("3", new Person("Siva"));
//        m2.put("4", new Person("Sandeep"));


        HashMap<String, Person> newMap = new HashMap<>();

        try {
            FileOutputStream fileOut = new FileOutputStream("HashMap.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(m);

            FileInputStream fileIn = new FileInputStream("HashMap.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            newMap = (HashMap<String, Person>) in.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("HashMap hashcode : " + m.hashCode());
        m.forEach(
                (k, v) ->
                {
                    System.out.println(k + " --> " + v);
                    System.out.println(k.hashCode() + " --> " + v.hashCode());
                }

        );

        System.out.println("\nHashMap 2 hashcode : " + m2.hashCode());
        m2.forEach(
                (k, v) ->
                {
                    System.out.println(k + " --> " + v);
                    System.out.println(k.hashCode() + " --> " + v.hashCode());
                }

        );
        System.out.println("\nHashMap 2 = HashMap : " + m.equals(m2));

        System.out.println("\nNew HashMap hashcode : " + newMap.hashCode());
        newMap.forEach(
                (k, v) ->
                {
                    System.out.println(k + " --> " + v);
                    System.out.println(k.hashCode() + " --> " + v.hashCode());
                }

        );

    }
}
