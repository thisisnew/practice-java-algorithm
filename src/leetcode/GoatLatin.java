package leetcode;

import java.io.IOException;

public class GoatLatin {
    public static void main(String[] args) throws IOException {
        System.out.println(toGoatLatin(""));
    }

    private static String toGoatLatin(String sentence) {

        var split = sentence.split(" ");
        var aCnt = 1;
        var sb = new StringBuilder();

        for (var word : split) {
            var ma = "m" + "a".repeat(aCnt++);

            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                sb.append(word).append(ma).append(" ");
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append(ma).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
