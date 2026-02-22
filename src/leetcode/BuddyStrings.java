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
        while(idx < sArr.length) {
            if (sArr[idx] != goalArr[idx]) {
                var isSwitch = false;

                for (var j = idx; j < sArr.length; j++) {
                    if (sArr[j] == goalArr[j]) {
                        isSwitch = true;
                        switchCh(sArr, idx, j);
                        break;
                    }
                }

                if (!isSwitch) {
                    return false;
                }
            }

            idx++;
        }

        return Arrays.toString(sArr).equals(goal);
    }

    private static void switchCh(char[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
