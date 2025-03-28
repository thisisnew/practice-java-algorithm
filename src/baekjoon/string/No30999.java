package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No30999 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] oxArr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for(int j = 0; j < s.length(); j++) {
                oxArr[i][j] = s.charAt(j) == 'O';
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            boolean allMatch = true;
            boolean value = oxArr[0][i];

            if (!value) {
                continue;
            }

            for (int j = 1; j < n; j++) {
                if (value != oxArr[j][i]) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                count++;
            }
        }

        System.out.println(count);
    }
}
