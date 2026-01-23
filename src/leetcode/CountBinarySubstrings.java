package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBinarySubstrings {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(countBinarySubstrings(br.readLine()));
    }

    private static int countBinarySubstrings(String s) {
        var prevRun = 0;
        var curRun = 1;
        var ans = 0;

        for (var i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curRun++;
            } else {
                ans += Math.min(prevRun, curRun);
                prevRun = curRun;
                curRun = 1;
            }
        }

        ans += Math.min(prevRun, curRun);

        return ans;
    }
}
