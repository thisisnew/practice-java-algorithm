package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int bigger = Integer.parseInt(st.nextToken());
            result[bigger] = i+1;
        }

        for (int v : result) {
            System.out.print(v + " ");
        }
    }
}
