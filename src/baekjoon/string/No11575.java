package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11575 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());   // 테스트케이스 수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String plainText = br.readLine();
            System.out.println(encrypt(a, b, plainText));
        }
    }

    private static String encrypt(int a, int b, String plainText) {

        StringBuilder result = new StringBuilder();

        for(char c : plainText.toCharArray()) {
            int x = c - 'A';
            int encrypted = (a * x + b) % 26;
            result.append((char) ('A' + encrypted));;
        }

        return result.toString();
    }
}
