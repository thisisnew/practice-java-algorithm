package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class No9612 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxCount = 0;
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String letter = br.readLine();
            int count = map.getOrDefault(letter, 0) + 1;
            map.put(letter, count);

            if (count > maxCount || (count == maxCount && letter.compareTo(result) > 0)) {
                maxCount = count;
                result = letter;
            }
        }

        System.out.println(result + " " + maxCount);
        br.close();
    }

}