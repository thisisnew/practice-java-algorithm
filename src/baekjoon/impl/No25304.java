package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price =  Integer.parseInt(st.nextToken());
            int cnt =  Integer.parseInt(st.nextToken());
            result += price * cnt;
        }

        if (result == x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
