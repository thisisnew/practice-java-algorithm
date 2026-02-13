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

        return new int[]{};
    }
}
