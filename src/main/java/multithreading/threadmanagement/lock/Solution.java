package multithreading.threadmanagement.lock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the substrings function below.
    static int substrings(String n) {
        HashSet<String> subStrings = new HashSet<>();

        for (int i = 0; i < n.length(); i++) {
            ArrayList<String> substrings = getSubStrings(n.substring(i));
            for (String item : substrings) {
                System.out.println(item);
                subStrings.add(item);
            }
        }

        int sum = 0;
        for (String element : subStrings) {
            sum += Integer.parseInt(element);
        }

        return sum;
    }

    private static ArrayList<String> getSubStrings(String aString) {
        ArrayList<String> l = new ArrayList<>();
        int stringLength = aString.length();
        for (int i = 0; i < stringLength; i++) {
            l.add(aString.substring(0, stringLength - i));
        }
        return l;
    }

    public static void main(String[] args) throws IOException {
        String n = scanner.nextLine();
        int result = substrings(n);
        System.out.println("result = " + result);

    }
}

