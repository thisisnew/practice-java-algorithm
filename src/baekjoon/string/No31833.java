package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No31833 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = get(new StringTokenizer(br.readLine()), n);
        int y = get(new StringTokenizer(br.readLine()), n);

        System.out.println(Math.min(x, y));
        br.close();
    }

    private static int get(StringTokenizer st, int n) {
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        return Integer.parseInt(sb.toString());
    }
}