package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No30402 {

    private static final Map<String, String> NAME_MAP = Map.of(
            "w", "chunbae",
            "b", "nabi",
            "g", "yeongcheol"
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String token = st.nextToken();

                if (NAME_MAP.containsKey(token)) {
                    System.out.println(NAME_MAP.get(token));
                    return;
                }
            }
        }
    }
}
