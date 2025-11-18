package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isValid(br.readLine()));
    }

    private static boolean isValid(String s) {
        var stack = new Stack<Character>();
        var len = s.length();
        var half = len/2;

        if (len % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (i < half) {
                stack.push(c);
                continue;
            }

            var pop = stack.pop();
            if (c != getOpposite(pop)) {
                return false;
            }
        }

        return true;
    }

    private static Character getOpposite(char c) {
        if (c == '(') {
            return ')';
        }

        if (c == ')') {
            return '(';
        }

        if (c == '[') {
            return ']';
        }

        if (c == ']') {
            return '[';
        }

        if (c == '{') {
            return '}';
        }

        return '{';
    }
}
