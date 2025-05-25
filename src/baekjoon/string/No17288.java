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

        while (idx < len) {
            if (!is3CharsSerial(s, idx)) {
                idx++;
                continue;
            }

            if (is4CharsSerial(s, idx)) {
                idx += 3;
                continue;
            }

            result++;
            idx++;
        }

        System.out.println(result);
        br.close();
    }

    private static boolean is3CharsSerial(String str, int idx) {

        try {
            int c1 = str.charAt(idx) - '0';
            int c2 = str.charAt(idx + 1) - '0';
            int c3 = str.charAt(idx + 2) - '0';

            return (c1 + 1 == c2) && (c1 + 2 == c3);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean is4CharsSerial(String str, int idx) {

        try {
            int c1 = str.charAt(idx) - '0';
            int c2 = str.charAt(idx + 1) - '0';
            int c3 = str.charAt(idx + 2) - '0';
            int c4 = str.charAt(idx + 3) - '0';

            return (c1 + 1 == c2) && (c1 + 2 == c3) && (c1 + 3 == c4);
        } catch (Exception e) {
            return false;
        }
    }
}