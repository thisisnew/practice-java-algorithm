package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 2023) {
            System.out.println(0);
        } else {
            int result  = 0;

            for (int i = 2023; i < n; i++) {




            }

            System.out.println(result);
        }

        br.close();
    }
}