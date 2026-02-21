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

        for (var i = 0; i < sArr.length; i++) {
            if (sArr[i] != goalArr[i]) {
                for (var j = i; j < s.length(); j++) {
                    if (sArr[j] == goalArr[j]) {
                        var temp = sArr[i];
                        sArr[i] = sArr[j];
                        sArr[j] = temp;
                        break;
                    }
                }
            }
        }

        return Arrays.toString(sArr).equals(goal);
    }
}
