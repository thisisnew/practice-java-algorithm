package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Character, Integer> firstNameMap = new HashMap<>();
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            int count = firstNameMap.getOrDefault(c, 0) + 1;
            firstNameMap.put(s.charAt(0), count);

            if (count > maxCount) {
                maxCount = count;
            }
        }

        if (maxCount < 5) {
            System.out.println("PREDAJA");
            return;
        }

        for (Map.Entry<Character, Integer> entry : firstNameMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
                break;
            }
        }

        br.close();
    }
}
