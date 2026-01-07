package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KeyboardRow {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.toString(findWords(new String[]{br.readLine()})));
    }

    private static String[] findWords(String[] words) {
        return new String[]{};
    }
}
