package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public static boolean isValidUsername(String username) {
        return username.matches(regularExpression);
    }
}

public class JavaValidUsernameRegularExpression {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            var username = br.readLine();
            System.out.println(UsernameValidator.isValidUsername(username) ? "valid" : "invalid");
        }
    }
}
