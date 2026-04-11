package leetcode;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        int len = Math.max(word1Array.length, word2Array.length);

        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            if (hasChar(word1Array, i)) {
                sb.append(word1Array[i]);
            }

            if (hasChar(word2Array, i)) {
                sb.append(word2Array[i]);
            }
        }

        return sb.toString();
    }

    private boolean hasChar(char[] array, int idx) {
        try {
            char c = array[idx];
        } catch (IndexOutOfBoundsException e) {
            return false;
        }

        return true;
    }
}
