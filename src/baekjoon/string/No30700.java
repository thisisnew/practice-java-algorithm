package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30700 {

    private static final char[] KOREA_CHARS = { 'K', 'O', 'R', 'E', 'A' };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 0;
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == KOREA_CHARS[idx]) {
                sb.append(c);

                if (++idx == KOREA_CHARS.length) {
                    idx = 0;
                }
            }
        }

        System.out.println(sb.toString().length());
        br.close();
    }
}