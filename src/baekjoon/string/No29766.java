package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No29766 {

    private static final String INITIAL = "DKSH";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int count = 0;

        for (int i = 0; i < input.length() - 3; i++) {
            if (INITIAL.equals(input.substring(i, i + 4))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
