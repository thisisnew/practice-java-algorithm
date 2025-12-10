package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class ReverseVowelsOfAString {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {

        var map = new HashMap<Integer, Character>();
        var indexes = new Stack<Integer>();

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (isVowel(c)) {
                map.put(i, c);
                indexes.push(i);
            }
        }

        if (indexes.isEmpty()) {
            return s;
        }

        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (!isVowel(c)) {
                sb.append(c);
                continue;
            }

            var idx = indexes.pop();
            sb.append(map.get(idx));
        }

        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return  c == 'a' || c == 'e' || c == 'i' || c == 'o'
    }
}
