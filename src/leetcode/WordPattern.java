package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordPattern {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();

        System.out.println(wordPattern(a, b));
    }

    private static boolean wordPattern(String pattern, String s) {
        return true;
    }
}
