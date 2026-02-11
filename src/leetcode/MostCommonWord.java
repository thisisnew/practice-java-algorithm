package leetcode;

import java.io.IOException;
import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) throws IOException {
        System.out.println(mostCommonWord("", new String[]{}));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {

        var tokens = paragraph.split(" ");
        var map = new HashMap<String, Integer>();

        for(var token : tokens){
            var word = token.replaceAll("[^A-Za-z !\\?\"',;\\.]", "");
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (var word : banned) {
            map.remove(word);
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
