package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No26040 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Set<Character> charSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            char c = st.nextToken().charAt(0);
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (charSet.contains(c)) {
                sb.append(String.valueOf(c).toLowerCase());
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
        br.close();
    }
}