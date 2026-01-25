package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToLowerCase {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(toLowerCase(br.readLine()));
    }

    private static String toLowerCase(String s) {

        var sb = new StringBuilder();

        for (var c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
