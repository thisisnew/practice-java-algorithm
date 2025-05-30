package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.offer(i);
        }

        StringBuilder sb = new StringBuilder();

        while (dq.size() > 1) {
            sb.append(dq.poll()).append(" ");
            dq.offer(dq.poll());
        }

        sb.append(dq.poll());

        System.out.println(sb);
    }
}
