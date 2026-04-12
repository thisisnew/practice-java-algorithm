package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] tokens = s.trim().split(" ");

        List<String> result = new ArrayList<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i].trim();

            if (!token.isBlank()) {
                result.add(token);
            }
        }

        return String.join(" ", result);
    }
}
