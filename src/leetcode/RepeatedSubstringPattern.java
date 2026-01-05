package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedSubstringPattern {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(repeatedSubstringPattern(br.readLine()));
    }

    private static boolean repeatedSubstringPattern(String s) {
        for  (int i = 1; i < s.length(); i++) {
            var part = s.substring(0, i);

            if (isRepeat(s, part)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isRepeat(String whole, String part) {
        if (whole.equals(part)) return true;

        var n = whole.length() / part.length();
        return part.repeat(n).equals(whole);
    }
}
