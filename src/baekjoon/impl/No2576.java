package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class No2576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 0) {
                continue;
            }

            nums.add(n);
        }

        if (nums.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = nums.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println(sum);

            nums.sort(Integer::compareTo);
            System.out.println(nums.get(0));
        }
    }
}
