package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class No33709 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int res = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (isNumber(c)) {
                sb.append(c);
                continue;
            }

            res += Integer.parseInt(sb.toString());
            sb = new StringBuilder();
        }



        br.close();
    }

    private static boolean isNumber(char c) {
        return Character.isDigit(c);
    }
}