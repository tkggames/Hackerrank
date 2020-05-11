package design.tkggames.hackerrank;

/**************************************************
 * @author Tkggames
 * Save The Prisoner Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int p;
        if(s == 1){
            p = m % n;
            return p == 0 ? n : p;
        }

        p = (m + s - 1) % n;
        return p == 0 ? n : p;
    }

    public static void main(String[] args) {
        int[][] sampleInput = new int[][]
                {
                        {5, 2,  1},
                        {5, 2,  2},
                        {7, 19, 2},
                        {3,  7, 3}
                };

        for(int[] arr : sampleInput){
            printFormat(arr, saveThePrisoner(arr[0], arr[1], arr[2]));
        }
    }

    private static void printFormat(int[] a, int result) {
        System.out.printf("[%2d, %2d %2d] = %2d%n", a[0], a[1], a[2], result);
    }
}
