package leetcode;

import java.io.IOException;
import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) throws IOException {
        System.out.println(mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {

        var tokens = paragraph.replaceAll("[!?',;.]", " ").split(" ");
        var map = new HashMap<String, Integer>();

        for(var token : tokens){
            var word = token.trim().toLowerCase();

            if (!word.isBlank()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (var word : banned) {
            map.remove(word.trim().toLowerCase());
        }

        var max = 0;
        var res = "";

        for (var entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }
}
