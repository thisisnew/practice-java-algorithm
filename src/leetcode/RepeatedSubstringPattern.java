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
        if (s.length() <= 2) {
            return true;
        }

        var half = s.length()/2;

        for  (int i = 1; i < half; i++) {
            var part = s.substring(0, i);

            if (!isRepeat(s, part)) {
                continue;
            }

            break;
        }

        return true;
    }

    private static boolean isRepeat(String whole, String part) {
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
