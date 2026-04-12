package leetcode;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] tokens = s.trim().split(" ");

        String[] result = new String[tokens.length];

        int idx = 0;
        for (int i = tokens.length - 1; i >= 0; i--) {
            result[idx++] = tokens[i];
        }

        return String.join(" ", result);
    }
}
