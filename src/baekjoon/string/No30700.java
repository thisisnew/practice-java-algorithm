package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30700 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c == 'K' || c == 'O' || c == 'R' || c == 'E' || c == 'A') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        if (map.size() < 5) {
            System.out.println(0);
        } else {
            int result = 1000;

            for (int v : map.values()) {
                if (v > result) {
                    continue;
                }

                result = v;
            }

            System.out.println(result);
        }

        br.close();
    }
}