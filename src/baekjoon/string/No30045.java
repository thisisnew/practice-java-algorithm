package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No30045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (containsTargetPattern(s)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    private static boolean containsTargetPattern(String s) {
        return s.contains("01") || s.contains("OI");
    }
}