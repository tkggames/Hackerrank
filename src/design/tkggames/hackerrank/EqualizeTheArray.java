package design.tkggames.hackerrank;

import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.IntStream;

/**************************************************
 * @author Tkggames
 * Equalize The Array Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/
public class EqualizeTheArray {
    static int equalizeArrayA(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        IntStream.of(arr).forEach(elem ->{
            hashMap.putIfAbsent(elem, 0);
            hashMap.computeIfPresent(elem, (key, val) -> val + 1);
        });

        return arr.length - hashMap.values().
                parallelStream().max(Comparator.
                comparingInt(Integer::intValue)).orElse(-1);
    }

    static int equalizeArrayB(int[] arr){
        int[] counter = new int[101];
        IntStream.of(arr).parallel().forEach(elem -> ++counter[elem]);
        return arr.length - IntStream.of(counter).parallel().max().orElse(0);
    }

    public static void main(String[] args) {
        int[] sampleInput = {3, 3, 2, 1, 3};
        printFormat("Map", equalizeArrayA(sampleInput));
        printFormat("Array", equalizeArrayB(sampleInput));
    }

    private static void printFormat(String description, long result) {
        System.out.printf("%6s : %2d%n", description, result);
    }
}
