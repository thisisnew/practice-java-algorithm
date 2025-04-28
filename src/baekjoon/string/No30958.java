package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int max = 0;

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '.' || c == ',') {
                continue;
            }

            int count = charMap.getOrDefault(c, 0) + 1;

            if (count > max) {
                max = count;
            }

            charMap.put(c, count);
        }

        System.out.println(max);
        br.close();
    }
}