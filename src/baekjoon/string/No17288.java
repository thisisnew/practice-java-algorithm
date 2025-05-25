package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class No17288 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;

        int idx = 0;
        int len = s.length();

        while (idx < len - 2) {
            int c1 = s.charAt(idx) - '0';
            int c2 = s.charAt(idx + 1) - '0';
            int c3 = s.charAt(idx + 2) - '0';

            if ((c1 + 1 != c2) || (c1 + 2 != c3)) {
                idx++;
                continue;
            }

            try {
                int c4 = s.charAt(idx + 3) - '0';
                if (c1 + 3 == c4) {
                    idx = idx + 4;
                    continue;
                }
            } catch (Exception e) {
                result++;
                break;
            }

            result++;
            idx++;
        }

        System.out.println(result);
        br.close();
    }
}