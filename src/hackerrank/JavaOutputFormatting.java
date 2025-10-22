package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOutputFormatting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var a = br.readLine().split(" ");
        var b = br.readLine().split(" ");
        var c = br.readLine().split(" ");

        System.out.println("================================");
        System.out.println(addWhiteSpace(a[0]) + leadingZero(a[1]));
        System.out.println(addWhiteSpace(b[0]) + leadingZero(b[1]));
        System.out.println(addWhiteSpace(c[0]) + leadingZero(c[1]));
        System.out.println("================================");
    }

    private static String addWhiteSpace(String s) {
        StringBuilder result = new StringBuilder(s);

        while (result.length() < 15) {
            result.append(" ");
        }

        return result.toString();
    }

    private static String leadingZero(String s) {

        StringBuilder result = new StringBuilder(s);

        while (result.length() < 3) {
            result.insert(0, "0");
        }

        return result.toString();
    }
}
