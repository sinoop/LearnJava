package lambdaexpressions;

import java.util.Arrays;
import java.util.stream.Stream;

public class FirstExercise {
    public static void main(String[] args) {

        System.out.println(
                Arrays.stream((new int[]{10, 20, 30}))
                        .map(x -> x * x)
                        .sum());

        Stream.of(10, 20, 30)
                .map(x -> x + 2)
                .forEach(x -> System.out.println(x));
    }

}
