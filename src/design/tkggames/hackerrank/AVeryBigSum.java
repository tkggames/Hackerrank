package design.tkggames.hackerrank;

import java.util.stream.LongStream;

/**************************************************
 * @author Tkggames
 * A Very Big Sum Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/

public class AVeryBigSum {
    static long aVeryBigSumA(long[] ar) {
        long sum = 0L;
        for(long elem : ar)
            sum += elem;
        return sum;
    }

    static long aVeryBigSumB(long[] ar){
        return LongStream.of(ar).parallel().reduce(0L, Long::sum);
    }

    public static void main(String[] args) {
        long[] sampleInput = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        printFormat("Iterative", aVeryBigSumA(sampleInput));
        printFormat("Stream Parallel", aVeryBigSumB(sampleInput));
    }

    private static void printFormat(String description, long result) {
        System.out.printf("%s : %d%n", description, result);
    }
}
