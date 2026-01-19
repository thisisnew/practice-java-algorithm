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
        var erased = false;

        for (int i = 0; i < s.length() / 2; i++) {
            var a = moves.charAt(i);
            var b = moves.charAt(moves.length() - i - 1);

            if (a != b) {
                if (erased) {
                    return false;
                }

                erased = true;
            }
        }

        return true;
    }
}
