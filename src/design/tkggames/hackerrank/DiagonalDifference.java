package design.tkggames.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**************************************************
 * @author Tkggames
 * Diagonal Difference Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/

public class DiagonalDifference {
    private static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0, right = 0;
        for (int diagonal = 0; diagonal < arr.size(); ++diagonal) {
            left += arr.get(diagonal).get(diagonal);
            right += arr.get(diagonal).get(arr.size() - diagonal - 1);
        }
        return Math.abs(right - left);
    }

    public static void main(String[] args) {
        int[][] sampleInput =
                {
                        {11, 2,   4},
                        { 4, 5,   6},
                        {10, 8, -12}
                };

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp;

        for(int[] arr : sampleInput){
            temp = new ArrayList<>();
            for(int elem : arr){
                temp.add(elem);
            }
            list.add(temp);
        }

        printFormat(diagonalDifference(list));
    }

    private static void printFormat(int result) {
        System.out.printf("%s : %d%n", "Diagonal Difference", result);
    }
}
