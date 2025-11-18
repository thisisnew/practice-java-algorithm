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

        if (len % 2 != 0) {
            return false;
        }

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            var c = s.charAt(i);

            if (stack.isEmpty() || c != getOpposite(stack.peek())) {
                stack.push(c);
                continue;
            }

            stack.pop();
        }

        return stack.isEmpty();
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
