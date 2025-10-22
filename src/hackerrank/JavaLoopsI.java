package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", n, i, n * i));
        }
    }
}
