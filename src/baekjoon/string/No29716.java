package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No29716 {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int j = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = 0;
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





    }
}