package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RansomNote {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();
        System.out.println(canConstruct(a, b));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {

        var magazineMap = map(magazine);

        for (var c : ransomNote.toCharArray()) {
            var count = magazineMap.get(c);

            if (Objects.isNull(count) || count == 0) {
                return false;
            }

            magazineMap.put(c, --count);
        }

        return true;
    }

    private static Map<Character, Integer> map(String s) {
        var map = new HashMap<Character, Integer>();

        for (var c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
