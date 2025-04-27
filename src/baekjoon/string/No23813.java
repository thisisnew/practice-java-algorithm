package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No23813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long sum = n;
        int m = 10;

        while (n% m != n) {
            long front = n/m;
            long back = n%m;

            String s = back + String.valueOf(front);
            sum += Long.parseLong(s);

            m *= 10;
        }

        System.out.println(sum);
        br.close();
    }
}