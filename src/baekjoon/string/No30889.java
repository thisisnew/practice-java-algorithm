package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No30889 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean [][] sits = new boolean[10][20];

        for (int i = 0; i < n; i++) {
            String sit = br.readLine();
            int sitV = sitNo(sit.charAt(0));
            int sitH = Integer.parseInt(sit.substring(1)) - 1;
            sits[sitV][sitH] = true;
        }

        for (int i = 0; i < sits.length; i++) {
            for (int j = 0; j < sits[i].length; j++) {
                if (sits[i][j]) {
                    System.out.print('o');
                } else {
                    System.out.print('.');
                }
            }

            if (i < sits.length - 1) {
                System.out.println();
            }
        }

        br.close();
    }

    private static int sitNo(char c) {

        if (c == 'A') {
            return 0;
        }

        if (c == 'B') {
            return 1;
        }

        if (c == 'C') {
            return 2;
        }

        if (c == 'D') {
            return 3;
        }

        if (c == 'E') {
            return 4;
        }

        if (c == 'F') {
            return 5;
        }

        if (c == 'G') {
            return 6;
        }

        if (c == 'H') {
            return 7;
        }

        if (c == 'I') {
            return 8;
        }

        if (c == 'J') {
            return 9;
        }

        throw new IllegalArgumentException();
    }
}