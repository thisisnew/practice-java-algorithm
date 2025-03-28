package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11575 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String plainText = br.readLine();
            System.out.println(encrypt(a, b, plainText));
        }
    }

    private static String encrypt(int a, int b, String plainText) {
        char[] result = new char[plainText.length()];

        for (int i = 0; i < plainText.length(); i++) {
            int x = plainText.charAt(i) - 'A';
            int encrypted = (a * x + b) % 26;
            result[i] = (char) ('A' + encrypted);
        }

        return new String(result);
    }

}
