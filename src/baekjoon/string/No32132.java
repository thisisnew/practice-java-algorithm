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

        for (int i = 0; i < n - 2; i+=3) {
            String sub = input.substring(i, i + 3);

            if (sub.equals("PS4")) {
                continue;
            }

            if (sub.equals("PS5")) {
                continue;
            }

            sb.append(sub);
        }


        br.close();
    }
}