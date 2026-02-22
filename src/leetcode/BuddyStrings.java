package leetcode;

import java.io.IOException;
import java.util.Arrays;

public class BuddyStrings {
    public static void main(String[] args) throws IOException {
        System.out.println(buddyStrings("", ""));
    }

    private static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        var sArr = s.toCharArray();
        var goalArr = goal.toCharArray();

        var idx = 0;
        while(idx < sArr.length - 1) {
            var temp = sArr[idx];
            sArr[idx] = sArr[idx+1];
            sArr[idx+1] = temp;

            if (Arrays.equals(sArr, goalArr)) {
                return true;
            }

            idx++;
        }

        return false;
    }
}
