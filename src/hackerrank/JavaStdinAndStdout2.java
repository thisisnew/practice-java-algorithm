package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var a = br.readLine();
        var b = Double.parseDouble(br.readLine());
        var c = Integer.parseInt(br.readLine());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
