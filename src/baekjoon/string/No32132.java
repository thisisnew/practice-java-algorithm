package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No32132 {

    private static final Set<String> PLAYING_STATIONS = Set.of("PS4", "PS5");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int idx = 0;

        while(idx + 2 < n) {
            String sub = input.substring(idx, idx + 3);

            if (!PLAYING_STATIONS.contains(sub)) {
                idx++;
                continue;
            }

            input = input.substring(0, idx + 2) + input.substring(idx + 3);
            n = input.length();
            idx = 0;
        }

        System.out.println(input);
        br.close();
    }
}