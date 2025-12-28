package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fizzBuzz(Integer.parseInt(br.readLine())));
    }

    private static List<String> fizzBuzz(int n) {
        var result = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            result.add(word(i));
        }

        return result;
    }

    private static String word(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}
