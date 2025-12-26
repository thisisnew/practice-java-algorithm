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
        var result = 0;
        var add = false;

        for (var c : s.toCharArray()) {
            numMap.put(c, numMap.getOrDefault(c, 0) + 1);
        }

        for (var cnt : numMap.values()) {
            if (cnt % 2 != 0) {
                if (cnt > maxOddNum) {
                    maxOddNum = cnt;
                }

                continue;
            }

            result += cnt;
        }

        return result + maxOddNum;
    }
}
