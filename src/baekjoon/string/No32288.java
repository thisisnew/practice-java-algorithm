package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No32288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);

            if (c == 'I') {
                sb.append('i');
            }

            if (c == 'l') {
                sb.append('L');
            }
        }

        System.out.println(sb);
        br.close();
    }
}