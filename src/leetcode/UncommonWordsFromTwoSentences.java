package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(uncommonFromSentences("", "")));
    }

    private static String[] uncommonFromSentences(String s1, String s2) {

        var s1Arr = s1.split(" ");
        var s2Arr = s2.split(" ");

        var res = new ArrayList<String>();
        res.addAll(uncommonWords(s1Arr, s2Arr));
        res.addAll(uncommonWords(s2Arr, s1Arr));

        return res.toArray(new String[0]);
    }

    private static List<String> uncommonWords(String[] s1Arr, String[] s2Arr) {
        var result = new ArrayList<String>();
        var words = new HashSet<>(Arrays.asList(s2Arr));

        for (var word: s1Arr) {
            if (!words.contains(word)) {
                result.add(word);
            }
        }

        return result;
    }
}
