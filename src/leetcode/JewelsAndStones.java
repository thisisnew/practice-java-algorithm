package leetcode;

import java.io.IOException;
import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) throws IOException {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    private static int numJewelsInStones(String jewels, String stones) {

        var map = new HashMap<Character, Integer>();

        for(var s : stones.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        var count = 0;

        for(var j : jewels.toCharArray()) {
            for(var entry : map.entrySet()) {
                if (entry.getValue() <= 0 || entry.getKey() != j) {
                    continue;
                }

                map.put(entry.getKey(), map.get(entry.getKey()) - 1);
                count++;
            }
        }

        return count;
    }
}
