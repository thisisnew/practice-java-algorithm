package leetcode;

import java.io.IOException;
import java.util.HashMap;

public class ReverseOnlyLetters {
    public static void main(String[] args) throws IOException {
        System.out.println(reverseOnlyLetters(""));
    }

    private static String reverseOnlyLetters(String s) {
        var map = new HashMap<Integer, Character>();

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (Character.isAlphabetic() || Character.isDigit(c)) {
                continue;
            }

            map.put(i, c);
        }

        var result = new StringBuilder();

        for (var i = s.length() -1; i >= 0; i--) {



        }

        return "";
    }
}
