package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(firstUniqChar(br.readLine()));
    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            var c = list.get(i);

            if (map.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
