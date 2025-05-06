package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No30822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            if (!matches(c)) continue;

            int count = charMap.getOrDefault(c, 0);
            charMap.put(c, ++count);
        }

        int min = 1000;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() < min) min = entry.getValue();
        }
        System.out.println(min);
        br.close();
    }

    private static boolean matches(char c) {
        return c == 'u' || c == 'o' || c == 's' || c == 'p' || c == 'c';
    }
}