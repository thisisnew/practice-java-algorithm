package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class No29716 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int j = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = st.countTokens()-1;
            while (st.hasMoreTokens()) {
                v += calculate(st.nextToken());
            }

            if (v <= j) {
                result += v;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static int calculate(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.isUpperCase(c) ? 4 : 2;
        }
        return sum;
    }
}