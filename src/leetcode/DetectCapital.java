package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class DetectCapital {

    private static final Set<Character> UPPER_CHARS = Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',  'M', 'N', 'O', 'P',  'Q', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(detectCapitalUse(br.readLine()));
    }

    private static boolean detectCapitalUse(String word) {

        for(char c : word.toCharArray()) {
            if(UPPER_CHARS.contains(c)) {
                continue;
            }

            return false;
        }

        return true;
    }
}
