package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1864 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals("#")) {
                break;
            }

            int pow = 0;
            int result = 0;

            for (int i = input.length() - 1; i >= 0; i--) {
                char c = input.charAt(i);

                //result += Math.pow()
            }

        }

        br.close();
    }

    private int convert(char c) {
        switch (c) {
            case '-':
                return 0;
            case '\\':
                return 1;
            case '(':
                return 2;
            case '@':
                return 3;
            case '?':
                return 4;
            case '>':
                return 5;
            case '&':
                return 6;
            case '%':
                return 7;
            case '/':
                return -1;
            default:
                throw new IllegalArgumentException("Invalid character: " + c);
        }
    }
}