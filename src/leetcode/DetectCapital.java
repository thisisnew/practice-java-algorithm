package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Set;

public class DetectCapital {

    private static final Set<Character> UPPER_CHARS = Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    private static final Set<Character> LOWER_CHARS = Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(detectCapitalUse(br.readLine()));
    }

    private static boolean detectCapitalUse(String word) {
        if (Objects.isNull(word) || word.isBlank()) return false;

        var upperCnt = 0;
        var lowerCnt = 0;
        var chars = word.toCharArray();
        var firstChar = chars[0];

        for(char c : chars) {
            if(UPPER_CHARS.contains(c)) {
                upperCnt++;
            } else {
                lowerCnt++;
            }
        }

        if (upperCnt == 0 || lowerCnt == 0) {
            return true;
        }

        return UPPER_CHARS.contains(firstChar) && upperCnt == 1;
    }
}
