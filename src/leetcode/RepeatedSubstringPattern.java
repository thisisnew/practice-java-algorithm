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
        if (s.length() == 1) {
            return true;
        }

        var half = s.length()/2;

        for  (int i = 1; i < half; i++) {

        }

        return true;
    }

    private boolean isRepeat(String whole, String part) {
        int len = part.length();

        for (int i = len; i < whole.length(); i+=len) {
            var s = whole.substring(i, i+len);

            if (!s.equals(part)) {
                return false;
            }
        }

        return true;
    }
}
