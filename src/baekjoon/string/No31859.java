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

        Set<Character> seen = new HashSet<>();
        StringBuilder unique = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (seen.add(c)) unique.append(c);
        }

        String result = "smupc_" + new StringBuilder()
                .append(1906 + n)
                .append(unique)
                .append(4 + s.length() - unique.length())
                .reverse();

        System.out.println(result);
        br.close();
    }
}