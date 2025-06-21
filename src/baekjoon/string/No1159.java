package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Character, Integer> firstNameMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = br.readLine().charAt(0);
            firstNameMap.put(c, firstNameMap.getOrDefault(c, 0) + 1);
        }

        List<Character> firstNames = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : firstNameMap.entrySet()) {
            if (entry.getValue() >= 5) {
                firstNames.add(entry.getKey());
            }
        }

        if (firstNames.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            firstNames.sort(Character::compareTo);
            for (char c : firstNames) {
                System.out.print(c);
            }
        }

        br.close();
    }
}
