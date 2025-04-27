package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No23813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int v = 10;

        while (n%v != n) {
            int front = n/v;
            int back = n%v;

            String s = back + String.valueOf(front);
            list.add(Integer.parseInt(s));

            v *= 10;
        }

        int result = list.stream().mapToInt(i -> i).sum();
        System.out.println(result + n);
        br.close();
    }
}