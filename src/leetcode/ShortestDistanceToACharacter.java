package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(shortestToChar("", 'a')));
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

            if (idx > index)  {
                if (Math.abs(idx - index) < Math.abs(index - result)) {
                    result = Math.abs(idx - index);
                }

                break;
            }

            if (Math.abs(index - idx) < Math.abs(index - result)) {
                result = Math.abs(index - idx);
            }
        }

        return result;
    }
}
