package design.tkggames.hackerrank;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**************************************************
 * @author Tkggames
 * Compare The Triplets Hackerrank Solutions
 * Date: 05/09/2020
 **************************************************/

public class CompareTheTriplets {
    static List<Integer> compareTripletsA(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>();

        score.add(0); //alice score
        score.add(0); // bob score

        for (int index = 0; index < b.size(); ++index) {
            if (a.get(index) > b.get(index))
                score.set(0, score.get(0) + 1);
            if (a.get(index) < b.get(index))
                score.set(1, score.get(1) + 1);
        }
        return score;
    }

    static List<Integer> compareTripletsB(List<Integer> a, List<Integer> b) {

        List<Integer> score = new ArrayList<>();

        score.add(0); //alice score
        score.add(0); // bob score

        IntStream.range(0, b.size()).parallel().forEach(index -> {
            if (a.get(index) > b.get(index))
                score.set(0, score.get(0) + 1);

            if (a.get(index) < b.get(index))
                score.set(1, score.get(1) + 1);
        });

        return score;
    }

    public static void main(String[] args) {
        int[] a = {17, 28, 30};
        int[] b = {99, 16, 8};

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

        printFormat("Iterative Solution", compareTripletsA(listA, listB));
        printFormat("Stream Parallel Solution", compareTripletsB(listA, listB));

    }

    private static void printFormat(String description, List<Integer> score) {
        System.out.printf("%s%n", description);
        System.out.printf("%10s : %3d%n%10s : %3d%n", "Alice", score.get(0), "Bob", score.get(1));
    }

}
