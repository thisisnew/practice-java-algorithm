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
        var multiplier = 1;

        var sb = new StringBuilder().append(0);
        for (int i = 0; i < value.length(); i++) {
            var c = value.charAt(i);

            if (i == 0 && (c == '+' || c == '-')) {
                if (c == '-') multiplier = -1;
                continue;
            }

            if (c >= '0' && c <= '9') {
                sb.append(c);
                continue;
            }

            break;
        }

        return result(multiplier, sb.toString());
    }

    private static int result(int multiplier, String s) {
        try {
            return multiplier * Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (multiplier == 1) {
                return 2147483647;
            }

            return -2147483648;
        }
    }
}
