package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No29766 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputs = br.readLine().toCharArray();

        int count = 0;

        for (int i = 0; i < inputs.length - 3; i++) {
            if (matches(inputs, i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean matches(char[] inputs, int i) {
        return inputs[i] == 'D' &&
                inputs[i + 1] == 'K' &&
                inputs[i + 2] == 'S' &&
                inputs[i + 3] == 'H';
    }
}
