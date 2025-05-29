package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No31859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        String st1Result = step1(s);
        String st2Result = step2(s, st1Result);
        String st3Result = step3(n, st2Result);
        String st4Result = step4(st3Result);
        String st5Result = step5(st4Result);

        System.out.println(st5Result);
        br.close();
    }

    private static String step1(String s) {

        Set<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!charSet.contains(c)) {
                charSet.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private static String step2(String before, String after) {
        int v = 4 + before.length() - after.length();
        return String.format("%s%d", after, v);
    }

    private static String step3(int n, String s) {
        int v = 1906 + n;
        return String.format("%d%s", v, s);
    }

    private static String step4(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    private static String step5(String s) {
        return "smupc_" + s;
    }
}
