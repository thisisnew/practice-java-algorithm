package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome2 {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(validPalindrome(br.readLine()));
    }

    private static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                // 삭제 1회 사용: 왼쪽 제거 또는 오른쪽 제거 둘 중 하나만 가능
                return isPalindromeRange(s, l + 1, r) || isPalindromeRange(s, l, r - 1);
            }
        }
        return true;
    }

    private static boolean isPalindromeRange(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
