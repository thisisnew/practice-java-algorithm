package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 철자분리집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        Character s = input.charAt(0);
        int result = 1;

        for (int i = 1; i < n; i++) {
            Character c = input.charAt(i);
            if (s == c) {
                continue;
            }

            result++;
            s = c;
        }

        System.out.println(result);
    }

}
