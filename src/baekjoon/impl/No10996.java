package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int first = Math.max(n / 2, n - (n / 2));
        int second = n - first;

        for (int i = 0; i < n; i++) {
            draw(first, false);
            System.out.println();
            draw(second, true);

            if (i < n-1) {
                System.out.println();
            }
        }
    }

    private static void draw(int n, boolean isTab) {
        if (isTab) {
            System.out.print(" ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            if (i < n-1) {
                System.out.print(" ");
            }
        }
    }
}
