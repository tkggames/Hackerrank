package design.tkggames.hackerrank;

import java.util.stream.IntStream;

/**************************************************
 * @author Tkggames
 * Simple Array Sum Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/

public class SimpleArraySum {
    /**
     * simple for each loop
     *
     * @param ar array of integers
     * @return sum of ar elements
     */
    static int simpleArraySumA(int[] ar) {
        int sum = 0;
        for (int elem : ar) {
            sum += elem;
        }
        return sum;
    }

    /**
     * Two pointer technique
     *
     * @param ar array of integers
     * @return sum of ar elements
     */
    static int simpleArraySumB(int[] ar) {
        int sum = 0;
        int left = 0, right = ar.length - 1;

        //if ar.length is even
        while (left < right) {
            sum += ar[left] + ar[right];
            ++left;
            --right;
        }
        //if odd, account for middle element
        if ((ar.length & 1) != 0) {
            sum += ar[ar.length / 2];
        }
        return sum;
    }

    /**
     *
     * @param ar array of integers
     * @return return sum of ar elements
     */
    static int simpleArraySumC(int[] ar) {
        //uses stream api
        return IntStream.of(ar).parallel().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 4, 10, 11};
        printFormat("For Loop", simpleArraySumA(ar));
        printFormat("Pointers", simpleArraySumB(ar));
        printFormat("Stream API", simpleArraySumC(ar));
    }

    private static void printFormat(String description, int result) {
        System.out.printf("%s : %d%n", description, result);
    }
}
