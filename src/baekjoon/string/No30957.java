package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No30957 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        Map<Character, Integer> countMap = new HashMap<>();
        countMap.put('A', 0);
        countMap.put('B', 0);
        countMap.put('S', 0);

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            countMap.put(c, countMap.get(c) + 1);
        }

        List<Character> order = Arrays.asList('B', 'S', 'A');

        List<Character> sorted = new ArrayList<>(countMap.keySet());
        sorted.sort((c1, c2) -> {
            int countCompare = Integer.compare(countMap.get(c2), countMap.get(c1));
            if (countCompare != 0) {
                return countCompare;
            }

            return Integer.compare(order.indexOf(c1), order.indexOf(c2));
        });

        for (char c : sorted) {
            System.out.println(c);
        }

        br.close();
    }
}