package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No33709 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int res = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);
                continue;
            }

            res += Integer.parseInt(sb.toString());
            sb = new StringBuilder();
        }

        if (!sb.isEmpty()) {
            res += Integer.parseInt(sb.toString());
        }

        System.out.println(res);
        br.close();
    }
}