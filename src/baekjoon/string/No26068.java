package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No26068 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine().substring(2);

            if (Integer.parseInt(s) < 90) {
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }
}