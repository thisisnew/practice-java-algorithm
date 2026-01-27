package leetcode;

import java.io.IOException;
import java.util.ArrayList;

public class ShortestCompletingWord {
    public static void main(String[] args) throws IOException {
        System.out.println(shortestCompletingWord("", new String[]{}));
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {

        var result = "";
        var list = new ArrayList<Character>();

        for (var c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                list.add(c);
            }
        }

        for (var word : words) {
            if (word.length() < list.size()) {
                continue;
            }

            var len = list.size();

            for (var c : word.toCharArray()) {

                if (Character.isDigit(c) || c == ' ' || !list.contains(c)) {
                    continue;
                }

                len--;
            }

            if (len > 0) {
                continue;
            }

            result = word;
            break;
        }

        return result;
    }
}
