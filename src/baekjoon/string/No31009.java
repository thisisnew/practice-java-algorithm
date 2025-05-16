package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No31009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map.put(input[0], Integer.parseInt(input[1]));
        }

        int fee = map.get("jinju");
        long count = map.values().stream()
                .filter(price -> price > fee)
                .count();

        System.out.println(fee);
        System.out.println(count);
        br.close();
    }
}