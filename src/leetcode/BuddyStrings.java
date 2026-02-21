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
                        switchCh(sArr, i, j);
                        break;
                    }
                }
            }
        }

        return Arrays.toString(sArr).equals(goal);
    }

    private static void switchCh(char[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
