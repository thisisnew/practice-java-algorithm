package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(longestPalindrome(br.readLine()));
    }

    private static int longestPalindrome(String s) {

        var numMap = new HashMap<Character, Integer>();
        var maxOddNum = 0;

        for (var c : s.toCharArray()) {
            numMap.put(c, numMap.getOrDefault(c, 0) + 1);
        }

        var result = 0;

        for (var cnt : numMap.values()) {
            if (cnt == 0) {
                result += cnt;
                continue;
            }

            if (maxOddNum <= cnt) {
                maxOddNum = cnt;
            }
        }

        return result + maxOddNum;
    }
}
