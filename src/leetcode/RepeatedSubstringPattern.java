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

        var wholeLen = whole.length();
        var partLen = part.length();

        if (wholeLen / 2 < partLen) {
            return false;
        }

        if (wholeLen % partLen != 0) {
            return false;
        }

        var n = wholeLen / partLen;
        var sb = new StringBuilder();
        sb.append(part.repeat(n));

        return sb.toString().equals(whole);
    }
}
