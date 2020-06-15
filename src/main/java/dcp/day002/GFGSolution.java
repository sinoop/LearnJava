package dcp.day002;

// Java program for product array puzzle
// with O(n) time and O(1) space.
public class GFGSolution {

    // epsilon value to maintain precision
    static final double EPS = 1e-9;

    static void productPuzzle(int[] a, int n) {
        // to hold sum of all values
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.log10(a[i]);

        // output product for each index
        // anti log to find original product value
        for (int i = 0; i < n; i++)
            System.out.print(
                    (int) (EPS
                            + Math.pow(
                            10.00, sum
                                    - Math.log10(a[i])))
                            + " ");
    }

    // Driver code
    public static void main(String[] args) {
        int[] a = {10, 3, 5, 6, 2};
        int n = a.length;
        System.out.println("The product array is: ");
        productPuzzle(a, n);
    }
}
// This code is contributed by Sumit Ghosh
