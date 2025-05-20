package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Set;

public class No5357 {

    private static final Set<String> PLAYING_STATIONS = Set.of("PS4", "PS5");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String input = br.readLine();

            StringBuilder sb = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (sb.isEmpty()) {
                    sb.append(c);
                }

                if (c != sb.charAt(sb.length() - 1)) {
                    sb.append(c);
                }
            }

            System.out.println(sb);
        }

        br.close();
    }
}