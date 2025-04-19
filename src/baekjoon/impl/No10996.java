package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10996 {

    private static final String SPACE = " ";
    private static final String ASTER = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] count = count(n);

        for (int i = 0; i < n; i++) {
            draw(count[0], false);
            System.out.println();
            draw(count[1], true);

            if (i < n-1) {
                System.out.println();
            }
        }
    }

    private static int[] count(int n) {

        int first = n / 2;
        int second = n - first;

        if (n % 2 != 0) {
            first = n - (n / 2);
            second = n - first;
        }

        return new int[]{ first, second };
    }

    private static void draw(int n, boolean isTab) {
        if (isTab) {
            System.out.print(SPACE);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ASTER);

            if (i < n-1) {
                System.out.print(SPACE);
            }
        }
    }
}
