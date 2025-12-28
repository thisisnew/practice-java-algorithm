package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(longestPalindrome(br.readLine()));
    }

    private static int longestPalindrome(String s) {

        var numMap = new HashMap<Character, Integer>();
        var result = 0;
        var oddNums = new ArrayList<Integer>();

        for (var c : s.toCharArray()) {
            numMap.put(c, numMap.getOrDefault(c, 0) + 1);
        }

        for (var cnt : numMap.values()) {
            if (cnt % 2 != 0) {
                oddNums.add(cnt);
                continue;
            }

            result += cnt;
        }

        return result + sumOddNums(oddNums);
    }

    private static int sumOddNums(ArrayList<Integer> oddNums) {
        if (oddNums.isEmpty()) return 0;

        if (oddNums.size() == 1) return oddNums.get(0);

        oddNums.sort((a, b) -> b - a);
        var result = oddNums.get(0);

        for (int i = 1; i < oddNums.size(); i++) {
            result += oddNums.get(i);
        }

        return result;
    }
}
