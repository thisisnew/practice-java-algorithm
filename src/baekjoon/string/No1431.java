package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No1431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list.sort(Comparator.comparing(String::length)  // 1. 길이순
                .thenComparing(No1431::digitSum)        // 2. 숫자의 합
                .thenComparing(String::compareTo));     // 3. 사전순

        for (String s : list) {
            System.out.println(s);
        }

        br.close();
    }

    private static int digitSum(String s) {
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }

        return sum;
    }
}
