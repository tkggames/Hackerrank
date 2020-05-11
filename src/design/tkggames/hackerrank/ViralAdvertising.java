package design.tkggames.hackerrank;

/**************************************************
 * @author Tkggames
 * Viral Advertising Solution
 * Date: 05/10/2020
 **************************************************/

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int shared, liked = 2, cumulative = 2;

        for(int day = 1; day < n; ++day){
            shared = liked * 3;
            liked = shared / 2;
            cumulative += liked;
        }

        return cumulative;
    }

    public static void main(String[] args) {
        int[] sampleInput = {5, 3};
        for(int value : sampleInput){
            printFormat(value, viralAdvertising(value));
        }
    }

    private static void printFormat(int val, int result) {
        System.out.printf("Input: %d = %d%n", val, result);
    }
}
