package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27494 {

    private static final char[] ARR_2023 = { '2', '0', '2', '3' };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 2023) {
            System.out.println(0);
        } else {
            int result  = 0;

            for (int i = 2023; i <= n; i++) {
                if (matches(i)) {
                    result++;
                }
            }

            System.out.println(result);
        }

        br.close();
    }

    private static boolean matches(int num) {
        int idx = 0;
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ARR_2023[idx]) {
                idx++;
                if (idx == 4) return true;
            }
        }

        return false;
    }
}