package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(firstUniqChar(br.readLine()));
    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = s.toCharArray();

        for (var i=0; i<chars.length; i++) {
            var c = chars[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        map.forEach((k, v) -> {
//
//        });

        return -1;
    }
}
