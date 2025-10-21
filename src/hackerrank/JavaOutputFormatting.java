package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOutputFormatting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var a = br.readLine();
        var b = br.readLine();
        var c = br.readLine();

        System.out.println("================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("================================");
    }
}
