package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No17202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int n = 16;
        int[] phoneNum = new int[n];

        for (int i = 0; i < 8; i++) {
            phoneNum[i*2] = a.charAt(i) - '0';
            phoneNum[i*2 + 1] = b.charAt(i) - '0';
        }

        while(n > 2) {
            n /= 2;

            phoneNum = new int[n];
        }

        br.close();
    }
}