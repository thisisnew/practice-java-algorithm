package leetcode;

import java.io.IOException;
import java.util.LinkedList;

public class ReverseOnlyLetters {
    public static void main(String[] args) throws IOException {
        System.out.println(reverseOnlyLetters(""));
    }

    private static String reverseOnlyLetters(String s) {

        var queue = new LinkedList<Character>();
        var result = new StringBuilder();

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                queue.push(c);
                continue;
            }

            while (!queue.isEmpty()) {
                result.append(queue.pop());
            }

            result.append(c);
        }

        while (!queue.isEmpty()) {
            result.append(queue.pop());
        }

        return result.toString();
    }
}
