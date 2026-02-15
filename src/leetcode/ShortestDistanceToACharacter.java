package leetcode;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(shortestToChar("", 'a')));
    }

    private static int[] shortestToChar(String s, char c) {

        var indexes = new HashSet<Integer>();

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                indexes.add(i);
            }
        }

        var result = new int[s.length()];

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                result[i] = 0;
                continue;
            }

            result[i] = closestIndex(indexes, i);
        }

        return result;
    }

    private static int closestIndex(HashSet<Integer> indexes, int index) {
        var result = Integer.MAX_VALUE;

        for (var idx : indexes) {
            if (Math.abs(index - result) > Math.abs(index - idx)) {
                result = idx;
            }
        }

        return result;
    }
}
