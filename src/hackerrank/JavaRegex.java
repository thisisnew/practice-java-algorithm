package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.regex.Pattern;

public class JavaRegex {
    public static void main(String[] args) throws IOException {
        var myRegex = new MyRegex();
        var br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            var s = br.readLine();

            if (Objects.isNull(s) || s.isBlank()) {
                break;
            }

            System.out.println(myRegex.isMatch(s));
        }

    }

    private static class MyRegex {
        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)$");

        public boolean isMatch(String input) {
            return pattern.matcher(input).matches();
        }
    }
}
