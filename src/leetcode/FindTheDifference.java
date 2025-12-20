package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindTheDifference {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();
        System.out.println(findTheDifference(a, b));
    }

    private static char findTheDifference(String s, String t) {
        var sMap = createMap(s.toCharArray());
        var tMap = createMap(t.toCharArray());

        Character result = null;

        for (var entry : sMap.entrySet()) {
            var sKey = entry.getKey();
            var sValue = entry.getValue();

            var tValue = tMap.get(sKey);

            if (!Objects.equals(sValue, tValue)) {
                result =  sKey;
                break;
            }
        }

        return result;
    }

    private static Map<Character, Integer> createMap(char[] chars) {

        var map = new HashMap<Character, Integer>();

        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

        return map;
    }

    private static Set<Character> createSet(char[] chars) {
        var set = new HashSet<Character>();

        for (char aChar : chars) {
            set.add(aChar);
        }

        return set;
    }
}
