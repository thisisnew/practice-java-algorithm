package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32929 {

    private static final char[] UOS_CHARS = new char[]{'U', 'O', 'S'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(UOS_CHARS[calIdx(n)]);
        br.close();
    }

    private static int calIdx(int n) {
        int idx = n % 3 - 1;

        if (idx < 0) {
            return 2;
        }

        return idx;
    }
}