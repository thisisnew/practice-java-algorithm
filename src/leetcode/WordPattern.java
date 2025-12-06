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
        var keyMap = new HashMap<Character, String>();
        var valueMap = new HashMap<String, Character>();

        for (int i = 0; i < pattern.length(); i++) {
            var c = pattern.charAt(i);
            var sp = split[i];
            var value = keyMap.get(c);
            var key = valueMap.get(sp);

            if (Objects.isNull(value)) {
                keyMap.put(c, sp);
            }

            if (Objects.isNull(key)) {
                valueMap.put(sp, c);
            }

            if (!value.equals(sp)) {
                return false;
            }

            if (!key.equals(c)) {
                return false;
            }
        }

        return true;
    }
}
