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

        for (int i = 1; i < s.length(); i++) {
            var c = s.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }

            var pop = stack.pop();

            if (c == '}' && pop != '{') {
                break;
            }

            if (c == ']' && pop != '[') {
                break;
            }

            if (c == ')' && pop != '(') {
                break;
            }
        }

        return stack.isEmpty();
    }
}
