package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No9612 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String letter = br.readLine();
            int count = map.getOrDefault(letter, 0) + 1;
            map.put(letter, count);

            max = Math.max(max, count);
        }

        List<String> letters = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value < max) {
                continue;
            }

            letters.add(key);
        }

        letters.sort(String::compareTo);

        String result = letters.get(letters.size() - 1);
        System.out.println(result + " " + map.get(result));
        br.close();
    }

}