package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30957 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        map.put('B', 0);
        map.put('S', 0);
        map.put('A', 0);

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            map.put(c, map.get(c) + 1);
        }

        br.close();
    }

}