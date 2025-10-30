package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class JavaPatternSyntaxChecker {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            var s = br.readLine();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            } catch (IllegalArgumentException | StackOverflowError e) {
                System.out.println("Invalid");
            }
        }
    }
}
