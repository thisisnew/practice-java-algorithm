package leetcode;

import java.io.IOException;
import java.util.Arrays;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(uncommonFromSentences("", "")));
    }

    private static String[] uncommonFromSentences(String s1, String s2) {

        var s1Arr = s1.split(" ");
        var s2Arr = s2.split(" ");

        return new String[]{};
    }
}
