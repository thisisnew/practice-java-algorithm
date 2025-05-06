package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No31833 {

    private static final char[] ARR_2023 = { '2', '0', '2', '3' };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String x = get(n);
        String y = get(n);


        br.close();
    }

    private static String get(int n) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(5);

        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        return sb.toString();
    }
}