package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No31833 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long x = get(br.readLine(), n);
        long y = get(br.readLine(), n);

        System.out.println(Math.min(x, y));
        br.close();
    }

    private static long get(String input, int n) {
        StringTokenizer st = new StringTokenizer(input);
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        return Long.parseLong(sb.toString());
    }
}