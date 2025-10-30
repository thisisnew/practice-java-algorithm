package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringTokens {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var tokens = br.readLine().split("[ !,?._'@]+");
        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
