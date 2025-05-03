package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        char[] arr = {'r', 's', 'e', 'f', 'a', 'q', 't', 'd', 'w', 'c', 'z', 'x', 'v', 'g'};

        char last = s[n-1];
        boolean find = false;
        for (char c : arr) {
            if (c == last) {
                System.out.println(1);
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.println(0);
        }

        br.close();
    }
}