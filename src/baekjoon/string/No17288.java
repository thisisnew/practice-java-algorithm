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

        for (int i = 0; i < s.length() - 2; i++) {
            if (is3CharsSerial(s, i) && is4CharsNotSerial(s, i)) {
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static boolean is3CharsSerial(String str, int idx) {

        try {
            String sub = str.substring(idx, idx + 3);
            int c1 = sub.charAt(0) - '0';
            int c2 = sub.charAt(1) - '0';
            int c3 = sub.charAt(2) - '0';

            return (c1 + 1 == c2) && (c1 + 2 == c3);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean is4CharsNotSerial(String str, int idx) {

        try {
            String sub = str.substring(idx, idx + 4);
            int c1 = sub.charAt(0) - '0';
            int c2 = sub.charAt(1) - '0';
            int c3 = sub.charAt(2) - '0';
            int c4 = sub.charAt(3) - '0';

            return (c1 + 1 == c2) && (c1 + 2 == c3) && (c1 + 3 != c4);
        } catch (Exception e) {
            return false;
        }
    }
}