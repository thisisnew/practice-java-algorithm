package leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueMorseCodeWords {

    private static final String[] MORSE_CODES = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private static final String[] ALPHABETS = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private static final Map<Character, String> CHAR_TO_MORSE_CODE = new HashMap<>();
    static {
        for (int i = 0; i < ALPHABETS.length; i++) {
            CHAR_TO_MORSE_CODE.put(ALPHABETS[i].charAt(0), MORSE_CODES[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(uniqueMorseRepresentations(new String[]{}));
    }

    private static int uniqueMorseRepresentations(String[] words) {

        var set = new HashSet<String>();

        for (var word : words) {
            var sb = new StringBuilder();

            for (var c : word.toCharArray()) {
                sb.append(CHAR_TO_MORSE_CODE.get(c));
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
