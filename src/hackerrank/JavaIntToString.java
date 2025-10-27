package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIntToString {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var n = br.readLine();
        System.out.println(answer(n));
    }

    private static String answer(String n) {
        try {
            Integer.parseInt(n);
        } catch (NumberFormatException e) {
            return "Wrong answer";
        }

        return "Good job";
    }
}
