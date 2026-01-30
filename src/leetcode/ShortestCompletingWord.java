package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ShortestCompletingWord {
    public static void main(String[] args) throws IOException {
        System.out.println(shortestCompletingWord("", new String[]{}));
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {

        var map = new HashMap<Character, Integer>();

        for (var c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(Character.toLowerCase(c), 0) + 1);
            }
        }

        var results = new ArrayList<String>();

        for (var word : words) {

            var copied = new HashMap<>(map);

            for (var c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    continue;
                }

                if (copied.containsKey(c) || copied.containsKey(Character.toLowerCase(c))) {
                    copied.put(c, copied.get(c) - 1);
                }
            }

            var pass = true;
            for (var value : copied.values()) {

                if (value != 0) {
                    pass = false;
                    break;
                }
            }

            if (pass) {
                results.add(word);
            }
        }

        results.sort(Comparator.comparingInt(String::length));
        return results.get(0);
    }
}
