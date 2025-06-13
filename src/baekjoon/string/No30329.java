package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No30329 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        for (int i = 0; i < s.length() - 3; i++) {
            if (s.startsWith("kick", i)) count++;
        }

        System.out.println(count);
        br.close();
    }
}