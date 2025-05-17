package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No33571 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        while (st.hasMoreTokens()) {
            for (char c : st.nextToken().toCharArray()) {
                result += countSpace(c);
            }
        }

        System.out.println(result);
        br.close();
    }

    private static int countSpace(char c) {

        if (c == 'B') {
            return 2;
        }

        if (
                c == 'A' ||
                c == 'a' ||
                c == 'b' ||
                c == 'D' ||
                c == 'd' ||
                c == 'e' ||
                c == 'g' ||
                c == 'O' ||
                c == 'o' ||
                c == 'P' ||
                c == 'p' ||
                c == 'Q' ||
                c == 'q' ||
                c == 'R' ||
                c == '@'
        ) {
            return 1;
        }

        return 0;
    }
}