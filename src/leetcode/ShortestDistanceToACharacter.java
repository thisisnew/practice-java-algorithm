package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }

    private static int[] shortestToChar(String s, char c) {

        var indexes = new ArrayList<Integer>();

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                indexes.add(i);
            }
        }

        var result = new int[s.length()];

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
                continue;
            }

            result[i] = closestDistance(indexes, i);
        }

        return result;
    }

    private static int closestDistance(ArrayList<Integer> indexes, int index) {

        var result = Integer.MAX_VALUE;

        for (var idx : indexes) {
            var diffBetweenIdx = Math.abs(index - idx);
            var diffBetweenResult = Math.abs(index - result);

            if (diffBetweenIdx < diffBetweenResult) {
                result = diffBetweenIdx;
            }
        }

        return result;
    }
}
