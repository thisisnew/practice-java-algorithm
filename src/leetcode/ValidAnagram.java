package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    private static final Map<Character, Integer> map = new HashMap<>();

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            var count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }

        for(char c: t.toCharArray()) {
            var count = map.getOrDefault(c, 0) - 1;

            if (count < 0) {
                return false;
            }

            map.put(c, count);
        }

        return true;
    }
}
