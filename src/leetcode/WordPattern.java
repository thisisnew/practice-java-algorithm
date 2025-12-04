package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();

        System.out.println(wordPattern(a, b));
    }

    private static boolean wordPattern(String pattern, String s) {

        var map = new HashMap<Character, String>();

        for (int i = 0; i < pattern.length(); i++) {
            var c = pattern.charAt(i);

            if (map.containsKey(c)) {

            }

        }

        return true;
    }
}
