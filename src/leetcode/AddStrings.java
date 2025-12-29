package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddStrings {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var num1 = br.readLine();
        var num2 = br.readLine();
        System.out.println(addStrings(num1, num2));
    }

    private static String addStrings(String num1, String num2) {
        var sum = Long.parseLong(num1) + Long.parseLong(num2);

        return String.valueOf(sum);
    }
}
