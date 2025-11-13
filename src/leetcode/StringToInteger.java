package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class StringToInteger {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(myAtoi(br.readLine()));
    }

    private static int myAtoi(String s) {
        if (Objects.isNull(s) || s.isBlank()) {
            return 0;
        }

        var value = s.trim();
        var multiplier = value.charAt(0) == '-' ? -1 : 1;

        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                if (i > 0) {
                    break;
                }
            }

            sb.append(c);
        }

        try {
            return multiplier * Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (multiplier == 1) {
                return 2147483647;
            }

            return -2147483648;
        }
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
