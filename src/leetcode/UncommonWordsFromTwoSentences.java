package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(uncommonFromSentences("", "")));
    }

    private static String[] uncommonFromSentences(String s1, String s2) {

        var s1Arr = s1.split(" ");
        var s2Arr = s2.split(" ");

        var result = new ArrayList<String>();

        if (s1Arr.length > s2Arr.length) {
            var words = new HashSet<>(Arrays.asList(s2Arr));

            for (var word: s1Arr) {
                if (words.contains(word)) {
                    continue;
                }

                result.add(word);
            }

        } else {

            var words = new HashSet<>(Arrays.asList(s1Arr));

            for (var word: s2Arr) {
                if (words.contains(word)) {
                    continue;
                }

                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
