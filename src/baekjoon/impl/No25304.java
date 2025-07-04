package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long result = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            result += Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
        }

        if (result == x) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
