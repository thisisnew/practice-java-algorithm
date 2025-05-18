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

        int idx = 0;

        do {
            if (idx + 2 >= n) {
                break;
            }

            String sub = input.substring(idx, idx + 3);

            if (sub.equals("PS4") || sub.equals("PS5")) {
                input = input.substring(0, idx + 2) + input.substring(idx + 3);
                n = input.length();
                idx = 0;
            } else {
                idx++;
            }

        } while (idx < n);

        System.out.println(input);
        br.close();
    }
}