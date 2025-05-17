package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No32132 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        do {
            if (idx + 3 > n) {
                sb.append(input.substring(idx));
                break;
            }

            String sub = input.substring(idx, idx + 3);

            if (sub.equals("PS4") || sub.equals("PS5")) {
                idx += 3;
            } else {
                sb.append(input.charAt(idx));
                idx++;
            }

        } while (idx < n);

        System.out.println(sb);
        br.close();
    }
}