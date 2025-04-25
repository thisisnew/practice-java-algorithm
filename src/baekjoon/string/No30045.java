package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No30045 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            result += count(s);
        }

        System.out.println(result);
        br.close();
    }

    private static int count(String s) {
        if (s.length() < 2) {
            return 0;
        }


    }
}