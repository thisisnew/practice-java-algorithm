package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int current = 0;
        int max = 0;

        for (int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            current -= Integer.parseInt(st.nextToken());
            current += Integer.parseInt(st.nextToken());

            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
        br.close();
    }
}