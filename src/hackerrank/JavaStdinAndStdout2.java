package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var a = Integer.parseInt(br.readLine());
        var b = Double.parseDouble(br.readLine());
        var c = br.readLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
