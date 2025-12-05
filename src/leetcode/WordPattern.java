package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();

        System.out.println(wordPattern(a, b));
    }

    private static boolean wordPattern(String pattern, String s) {

        var split = s.split(" ");

        var map = new HashMap<Character, String>();

        for (int i = 0; i < pattern.length(); i++) {
            var c = pattern.charAt(i);

            var value = map.get(c);

            if (Objects.isNull(value)) {
                map.put(c, split[i]);
                continue;
            }


        }

        return true;
    }
}
