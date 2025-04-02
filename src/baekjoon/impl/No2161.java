package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (!q.isEmpty()) {
            if (count % 2 == 0) {
                sb.append(q.poll()).append(" ");
            } else {
                int polled = q.poll();
                q.offer(polled);
            }

            count++;
        }

        System.out.println(sb.toString().trim());
    }
}
