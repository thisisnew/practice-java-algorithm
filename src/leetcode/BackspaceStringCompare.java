package leetcode;

import java.io.IOException;

public class BackspaceStringCompare {
    public static void main(String[] args) throws IOException {
        System.out.println(backspaceCompare("", ""));
    }

    private static boolean backspaceCompare(String s, String t) {

        var sSb = new StringBuilder();
        var tSb = new StringBuilder();

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                sSb.deleteCharAt(sSb.length() - 1);
            } else {
                sSb.append(s.charAt(i));
            }
        }

        for (var i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                tSb.deleteCharAt(tSb.length() - 1);
            } else {
                tSb.append(t.charAt(i));
            }
        }

        return sSb.toString().contentEquals(tSb);
    }
}
