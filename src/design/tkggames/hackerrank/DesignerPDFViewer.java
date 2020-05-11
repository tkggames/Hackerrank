package design.tkggames.hackerrank;
/**************************************************
 * @author Tkggames
 * Save The Prisoner Hackerrank Solutions
 * Date: 05/10/2020
 **************************************************/
public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;

        for (int ch : word.toCharArray()) {
            int index = ch - 97;
            if (max < h[index]){
                max = h[index];
            }
        }
        return max * word.length();
    }

    public static void main(String[] args) {
        int[][] sampleInput =
                {
                        {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                        {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}

                };
        String[] sampleStrings = {"abc", "zaba"};

        for(int subscript = 0; subscript < sampleInput.length; subscript++){
            printFormat(sampleStrings[subscript], designerPdfViewer(sampleInput[subscript], sampleStrings[subscript]));
        }
    }

    private static void printFormat(String word, int result){
        System.out.printf("%7s : %3d%n", word, result);
    }
}
