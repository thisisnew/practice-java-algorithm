package leetcode;

import java.io.IOException;

public class RotateString {
    public static void main(String[] args) throws IOException {
        System.out.println(rotateString("",""));
    }

    private static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }

        for (var i = 0; i < s.length(); i++) {
            var sub = s.substring(0, i);
            var remain = s.substring(i);
            var newStr = remain + sub;

            if (newStr.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}
