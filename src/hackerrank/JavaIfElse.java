package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 != 0) {
            System.out.println("Weird");
            return;
        }

        if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
            return;
        }

        if (N >= 6 && N <= 20) {
            System.out.println("Weird");
            return;
        }

        System.out.println("Not Weird");
    }
}
