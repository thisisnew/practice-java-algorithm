package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
        }


        System.out.println(sum/5);


    }
}
