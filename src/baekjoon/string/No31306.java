package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No31306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = 0;
        int second = 0;

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                second++;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                first++;
            }
        }

        System.out.println(first + " " + second);
        br.close();
    }
}