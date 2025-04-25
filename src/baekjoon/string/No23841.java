package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No23841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();

            for(int j = 0; j < ch.length; j++) {
                arr[i][j] = ch[j];
            }
        }

        for(char[] ch : arr) {




        }
        br.close();
    }
}