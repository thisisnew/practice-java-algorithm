package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestPalindromicSubstring {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(longestPalindrome(br.readLine()));
    }

    public static String longestPalindrome(String s) {
        var map = new HashMap<Integer, String>();
        var maxLength = 0;
        var len = s.length();

        for (var i = 0; i < len; i++) {
            var sb = new StringBuilder();

            if (len - i < maxLength) {
                break;
            }

            for (var j = i; j < len; j++) {
                var c = s.charAt(j);
                sb.append(c);
                var str = sb.toString();

                if (str.charAt(0) != str.charAt(str.length() - 1)) {
                    continue;
                }

                if (!str.equals(reverse(str))) {
                    continue;
                }

                if (str.length() > maxLength) {
                    maxLength = str.length();
                    map.put(str.length(), str);
                }
            }
        }

        return map.get(maxLength);
    }

    private static String reverse(String s) {
        var sb = new StringBuilder();
        var chars = s.toCharArray();

        for (var i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
