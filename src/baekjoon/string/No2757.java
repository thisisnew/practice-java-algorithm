package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class No2757 {

    private static final char[] ALPHABETS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    private static final int ALPHABETS_LENGTH = ALPHABETS.length;
    private static final String R0C0 = "R0C0";
    private static final String C = "C";
    private static final String R = "R";

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

            System.out.println(createRStr(c) + r);
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

    private static String createRStr(int n) {

        int a = n / ALPHABETS_LENGTH;
        int b = n % ALPHABETS_LENGTH;

        return "";
    }
}