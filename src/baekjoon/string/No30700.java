package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30700 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = { 'K', 'O', 'R', 'E', 'A' };
        int idx = 0;
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == arr[idx]) {
                idx++;
                sb.append(c);
            }

            if (idx == arr.length) {
                idx = 0;
            }
        }

        System.out.println(sb.toString().length());
        br.close();
    }
}