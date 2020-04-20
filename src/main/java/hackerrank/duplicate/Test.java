package hackerrank.duplicate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) throws ParseException, InterruptedException {
        System.out.println(LocalDateTime.now().toLocalTime());
        System.out.println(ZonedDateTime.now());
        System.out.println(Calendar.getInstance().getTime());

        System.out.println(new Date());

        ConcurrentHashMap<String, String> ab = new ConcurrentHashMap<>();
//        ab.put(null,"a");


        List<String> con = new ArrayList<String>();
        con.add("Asia");
        con.add("North America");

        con.stream().forEach((n) -> {
        });


        con.forEach(System.out::println);
//        con.forEach(System.out.println(con.next()));


        TimeUnit.MILLISECONDS.sleep(1000);
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
//        int c = Math.addExact(a,b);

        StringBuffer sb = new StringBuffer();
        SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
//        System.out.println(s.parse("01-02-1990"));


        Consumer<String> cona = Test::accept;
        cona.accept("Harry");

        try {
//            System.out.println(c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


    }

    private static void accept(String o) {
        System.out.println("Welcom" + o);
    }

    private static void show(List<String> c) {
//        System.out.println("Welcom" + c.get());
    }
}
