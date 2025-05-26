package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class No29713 {

    private static final String BRONZE_SILVER = "BRONZESILVER";

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int result = 0;
        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < n; i++) {
            alphabet.put(s.charAt(i), alphabet.getOrDefault(s.charAt(i), 0) + 1);
        }

        int idx = 0;
        while (true) {
            char c = BRONZE_SILVER.charAt(idx);
            int count = alphabet.getOrDefault(c, 0);
            if (count <= 0) break;

            alphabet.put(c, --count);
            idx++;

            if (idx == BRONZE_SILVER.length()) {
                result++;
                idx = 0;
            }
        }

        System.out.println(result);
        br.close();
    }
}