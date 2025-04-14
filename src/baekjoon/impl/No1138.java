package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class No1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int count = 0;
            int v = Integer.parseInt(st.nextToken());

            if (arr[i] == -1) {
                if (count == v) {
                    arr[i] = i + 1;
                }
                count++;
            }
        }

        System.out.println();
    }
}
