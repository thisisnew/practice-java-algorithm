package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class No31859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = removeDuplicates(br.readLine());


        br.close();
    }

    private static String removeDuplicates(String s) {

        Set<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!charSet.contains(c)) {
                charSet.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
