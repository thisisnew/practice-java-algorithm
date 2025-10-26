package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class JavaEndOfFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;

        while (true) {
            var s = br.readLine();

            if (Objects.isNull(s) || s.isBlank()) {
                break;
            }

            System.out.printf("%d %s%n", n++, s);
        }
    }
}
