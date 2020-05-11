package design.tkggames.hackerrank;


import java.util.stream.IntStream;

/**************************************************
 * @author Tkggames
 * StairCase Hackerrank Solutions
 * Date: 05/09/2020
 *
 * Note.
 *  staircaseA method is Java 8 Specific
 *  staircaseB method is Java 14 Specific
 *
 *  Build this with java 14
 **************************************************/

public class Staircase {
    static void staircaseA(int n) {
        String stairFormat = "%"+n+"s%n";
        String numSign = "#";
        StringBuilder builder = new StringBuilder();

        IntStream.range(0, n).forEach(i ->{
            builder.append(numSign);
            System.out.printf(stairFormat, builder);
        });
    }

    static void staircaseB(int n){
        //only works with java 11 or greater
        String stairFormat = "%"+n+"s%n";
        String numSign = "#";
        IntStream.range(1, n + 1).
                forEach(value -> System.out.printf(stairFormat, numSign.repeat(value)));
    }

    public static void main(String[] args) {
         int[] sampleInput = {4, 6};
         for(int value : sampleInput){
             printFormat(0, value);
             printFormat(1, value);
         }
    }

    private static void printFormat(int choice, int sampleInput) {
        switch (choice) {
            case 0 -> staircaseA(sampleInput);
            case 1 -> staircaseB(sampleInput);
        }
    }

}
