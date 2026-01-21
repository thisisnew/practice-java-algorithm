package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidPalindrome2 {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(validPalindrome(br.readLine()));
    }

    private static boolean validPalindrome(String s) {
        var stack = new Stack<Character>();

        for (var c : s.toCharArray()) {
            stack.push(c);
        }

        return true;
    }
}
