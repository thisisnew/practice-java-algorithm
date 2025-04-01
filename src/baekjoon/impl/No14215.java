package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < 3; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        int a = pq.poll();
        int b = pq.poll();
        int c = pq.poll();

        while (a + b <= c){
            c--;
        }

        System.out.println(a + b + c);
    }
}
