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

        var len = s.length();
        var lastIdx = len - 1;

        for  (int i = 1; i < s.length(); i++) {
            var part = s.substring(0, i);

            if (!isRepeat(s, part)) {
                if (i == lastIdx) {
                    return false;
                }

                continue;
            }

            break;
        }

        return true;
    }

    private static boolean isRepeat(String whole, String part) {
        if (part.length() > whole.length()/2) {
            return false;
        }

        for (var i = part.length(); i < whole.length(); i+=part.length()) {
            if (part.equals(whole.substring(i, i + part.length()))) {
                continue;
            }

            return false;
        }

        return true;
    }
}
