package leetcode;

import java.io.IOException;

public class BackspaceStringCompare {
    public static void main(String[] args) throws IOException {
        System.out.println(backspaceCompare("", ""));
    }

    private static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String s) {
        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
                continue;
            }

            if (!sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
