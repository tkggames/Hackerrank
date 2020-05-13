package design.tkggames.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAndTheValidString {
    static String isValid(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int ch : s.toCharArray()) {
            map.putIfAbsent(ch, 0);
            map.computeIfPresent(ch, (k, v) -> v + 1);
        }

        Set<Integer> values = new HashSet<>(map.values());

        if (values.size() == 1)
            return "YES";
        if (values.size() > 2)
            return "NO";

        int max = 0, min = Integer.MAX_VALUE, sameAsMin = 0, sameAsMax = 0;

        for (int value : values) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }


        for (int value : map.values()) {
            if (value == min)
                ++sameAsMin;
            if (value == max)
                ++sameAsMax;
        }
        if (min == 1 && sameAsMin == 1)
            return "YES";
        if ((max - min) == 1 && sameAsMax == 1)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        String[] arr = {"aabbcd", "aabbccddeefghi", "abcdefghhgfedecba", "abcde", "d", "ccbb", "ffffbbbbcd"};
        for (String test : arr) {
            System.out.printf("%-20s : %-3s%n", test, isValid(test));
        }
    }
}
