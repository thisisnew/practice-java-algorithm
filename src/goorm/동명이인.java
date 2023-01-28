package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동명이인 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.contains(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
