package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No30045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (hasTargetPattern(s)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    private static boolean hasTargetPattern(String s) {

        if (s.length() < 2) {
            return false;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char current = s.charAt(i);
            char next = s.charAt(i + 1);

            if (current != '0' && current != 'O') {
                continue;
            }

            if (current == '0' && next == '1') {
                return true;
            }

            if (current == 'O' && next == 'I') {
                return true;
            }
        }
        
        return false;
    }
}