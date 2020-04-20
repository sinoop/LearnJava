package interviews.goldmansachs.smallestNSecondSmallest;
//https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array/0

import java.util.Scanner;
import java.util.stream.IntStream;

public class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final StringBuilder sb = new StringBuilder();

        IntStream.range(0,sc.nextInt()).forEach(
                x -> {
                    int arraySize = sc.nextInt();
                    int[] array = new int[arraySize];
                    IntStream.range(0,arraySize).forEach(
                            y ->{
                                array[y] = sc.nextInt();
                            }
                    );
                    sb.append(getSmallestAndSecondSmallest(array)+"\n");
                }
        );
        System.out.println(sb.toString());
    }

    private static String getSmallestAndSecondSmallest(int[] array) {
        int smallest = 0;
        int secondSmallest = 0;
        int arraySize = array.length;

        if(arraySize <= 1){
            return "-1";
        } else {
            // Assume 1st element is smallest and second is the second smallest
            if(array[0]<array[1]){
                smallest = array[0];
                secondSmallest = array[1];
            } else{
                smallest = array[1];
                secondSmallest = array[0];
            }

            for(int i = 2 ;i<arraySize;i++){
                if(array[i]<secondSmallest){
                    if(array[i]<smallest){
                        secondSmallest = smallest;
                        smallest = array[i];
                    } else if(array[i] > smallest){
                        secondSmallest = array[i];
                    }
                }
            }
        }

        if(smallest == secondSmallest)
            return "-1";

        return smallest + " " + secondSmallest;
    }
}
