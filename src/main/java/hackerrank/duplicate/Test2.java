package hackerrank.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("1", "2", "3");
        String result = a.stream().reduce("", String::concat);
//        System.out.println(result);

        Stream.of("Mango", "Orange", "Apple").filter(fruit -> {
            System.out.println("Fruit : " + fruit);
            return true;
        });

        List<Integer> inters = Arrays.asList(10, 10, 30, 20, 30).stream()
                .filter(nu -> nu > 18)
                .sorted()
                .sequential()
                .map(Integer::new)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

//        System.out.println(inters.toString());
    }
}
