package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sCount = 0;
        int tCount = 0;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 's') {
                sCount++;
            }

            if (input.charAt(i) == 't') {
                tCount++;
            }
        }

        int idx = 0;
        while (sCount != tCount) {
            char removed = input.charAt(idx);
            if (removed == 's') {
                sCount--;
            }

            if (removed == 't') {
                tCount--;
            }

            idx++;
        }

        System.out.println(input.substring(idx));
        
        br.close();
    }
}