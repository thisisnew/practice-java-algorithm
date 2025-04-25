package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No30045 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sum += count(s);
        }

        System.out.println(sum);
        br.close();
    }

    private static int count(String s) {
        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                result++;
            }

            if (s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                result++;
            }
        }

        return result;
    }
}