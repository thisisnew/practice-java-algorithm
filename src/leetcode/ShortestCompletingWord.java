package leetcode;

import java.io.IOException;
import java.util.HashMap;

public class ShortestCompletingWord {
    public static void main(String[] args) throws IOException {
        System.out.println(shortestCompletingWord("", new String[]{}));
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {

        var map = new HashMap<Character, Integer>();

        for (var c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (var word : words) {

        }

        return "";
    }
}
