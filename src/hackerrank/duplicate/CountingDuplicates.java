package hackerrank.duplicate;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Integer counter = 0;
        while (text.length() > 0) {
            String a = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(a)) {
                counter++;
            }
            text.replace(a, "");
        }
        return counter;
    }
}
