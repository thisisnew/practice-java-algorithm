package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KeyboardRow {

    private static final String[] FIST_ROW = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
    private static final String[] SECOND_ROW = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    private static final String[] THIRD_ROW = {"z", "x", "c", "v", "b", "n", "m"};

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.toString(findWords(new String[]{br.readLine()})));
    }

    private static String[] findWords(String[] words) {
        return new String[]{};
    }
}
