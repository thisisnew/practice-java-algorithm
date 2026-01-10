package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Set;

public class DetectCapital {

    private static final Set<Character> UPPER_CHARS = Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

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
