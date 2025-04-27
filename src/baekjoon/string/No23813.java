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
        int m = 10;

        while (n% m != n) {
            int front = n/ m;
            int back = n% m;

            String s = back + String.valueOf(front);
            list.add(Integer.parseInt(s));

            m *= 10;
        }

        int result = 0;

        for (int v : list) {
            result += v;
        }

        System.out.println(result + n);
        br.close();
    }
}