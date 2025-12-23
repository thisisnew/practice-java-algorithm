package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IsSubsequence {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        var t = br.readLine();
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {

        var sCharArray = s.toCharArray();
        var lastIndex = sCharArray.length - 1;
        var idx = 0;

        if (sCharArray.length == 0) {
            return false;
        }

        for (var c : t.toCharArray()) {
            if (c == sCharArray[idx]) {
                idx++;
                if (idx > lastIndex) return true;
            }
        }

        return false;
    }
}
