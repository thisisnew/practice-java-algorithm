package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No29716 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int j = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int result = 0;

        for (int i = 0; i < n; i++) {
            int size = calculate(br.readLine());

            if (size <= j) {
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static int calculate(String s) {
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += 4;
            }

            if (Character.isLowerCase(c) || Character.isDigit(c)) {
                sum += 2;
            }

            if (c == ' ') {
                sum += 1;
            }
        }

        return sum;
    }
}
