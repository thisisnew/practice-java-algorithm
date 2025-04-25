package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No23841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] inputs = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            System.arraycopy(arr, 0, inputs[i], 0, arr.length);
        }

        char[][] result = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] arr = inputs[i];
            int len = arr.length;
            char[] ch = new char[len];

            for (int j = 0; j < len; j++) {
                if (arr[j] == '.') {
                    ch[j] = '.';
                    continue;
                }

                ch[j] = arr[j];
                ch[len-j-1] = arr[j];
            }

            result[i] = ch;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        br.close();
    }
}