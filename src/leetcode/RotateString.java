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

        }

        return true;
    }
}
