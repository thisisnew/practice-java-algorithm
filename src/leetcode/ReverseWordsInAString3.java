package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWordsInAString3 {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reverseWords(br.readLine()));
    }

    private static String reverseWords(String s) {
        if (s.isBlank()) return "";

        var sb = new StringBuilder();

        var tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            var token = tokenizer.nextToken();
            sb.append(reverse(token)).append(" ");
        }

        return sb.toString().trim();
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
