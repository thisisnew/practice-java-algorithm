package leetcode;

import java.io.IOException;

public class GoatLatin {
    public static void main(String[] args) throws IOException {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    private static String toGoatLatin(String sentence) {

        var split = sentence.split(" ");
        var aCnt = 1;
        var sb = new StringBuilder();

        for (var word : split) {
            var ma = "m" + "a".repeat(++aCnt);

            switch (word.charAt(0)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> sb.append(word).append(ma).append(" ");
                default -> sb.append(word.substring(1)).append(word.charAt(0)).append(ma).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
