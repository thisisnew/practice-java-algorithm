package leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class ReverseOnlyLetters {
    public static void main(String[] args) throws IOException {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    private static String reverseOnlyLetters(String s) {

        var cMap = new HashMap<Integer, Character>();
        var queue = new LinkedList<Character>();
        var result = new StringBuilder();

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (!Character.isAlphabetic(c)) {
                cMap.put(i, c);
                continue;
            }

            queue.push(c);
        }

        var idx = 0;
        while (idx < s.length()) {
            var c = cMap.containsKey(idx) ? cMap.get(idx) : queue.pop();
            result.append(c);
            idx++;
        }

        return result.toString();
    }
}
