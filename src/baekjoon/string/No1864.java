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
                result += (int) Math.pow(8, pow) * convert(input.charAt(i));
                pow++;
            }

            System.out.println(result);
        }

        br.close();
    }

    private static int convert(char c) {
        return switch (c) {
            case '-' -> 0;
            case '\\' -> 1;
            case '(' -> 2;
            case '@' -> 3;
            case '?' -> 4;
            case '>' -> 5;
            case '&' -> 6;
            case '%' -> 7;
            case '/' -> -1;
            default -> throw new IllegalArgumentException("Invalid character: " + c);
        };
    }
}