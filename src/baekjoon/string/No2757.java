package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class No2757 {

    private static final String C = "C";
    private static final String R = "R";
    private static final String R0C0 = "R0C0";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (isEnd(s)) {
                break;
            }

            Map<String, Integer> rcMap = createRcMap(s);
            int r = rcMap.get(R);
            int c = rcMap.get(C);


        }

        br.close();
    }

    private static boolean isEnd(String s) {
        return Objects.equals(R0C0, s);
    }

    private static Map<String, Integer> createRcMap(String s) {

        String[] split = s.substring(1).split(C);

        String s1 = split[0];
        String s2 = split[1];

        Map<String, Integer> result = new HashMap<>();
        result.put(R, Integer.parseInt(s1));
        result.put(C, Integer.parseInt(s2));

        return result;
    }
}