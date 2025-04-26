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

        for (int i = 0; i < n; i++) {
            char[] current = inputs[i];
            int len = current.length;
            char[] next = new char[len];

            for (int j = 0; j < len; j++) {
                if (current[j] == '.') {
                    if (next[j] == 0) {
                        next[j] = '.';
                    }

                    continue;
                }

                next[j] = current[j];
                next[len-j-1] = current[j];
            }

            System.out.print(new String(next));
            if (i < n -1) System.out.println();
        }

        br.close();
    }
}