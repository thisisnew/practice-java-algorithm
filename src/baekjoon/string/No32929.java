package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32929 {

    private static final char[] UOS_CHARS = new char[]{'U', 'O', 'S'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(UOS_CHARS[n%3 - 1]);
        br.close();
    }
}