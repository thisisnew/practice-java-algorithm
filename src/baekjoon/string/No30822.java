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
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> charMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = st.nextToken();

            if (!matches(input)) continue;

            int count = charMap.getOrDefault(input, 0);
            charMap.put(input, ++count);
        }

        int min = 1000;
        for (Map.Entry<String, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() < min) min = entry.getValue();
        }
        System.out.println(min);
        br.close();
    }

    private static boolean matches(String input) {
        char c = input.charAt(0);
        return c == 'u' || c == 'o' || c == 's' || c == 'p' || c == 'c';
    }
}