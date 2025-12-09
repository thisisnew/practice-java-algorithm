package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ReverseVowelsOfAString {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {

        var map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                map.put(c, i);
            }
        }

        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

        }

        return sb.toString();
    }
}
