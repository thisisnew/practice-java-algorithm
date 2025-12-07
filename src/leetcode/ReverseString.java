package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();

        reverseString(s.toCharArray());
    }

    private static void reverseString(char[] s) {

        char[] result = new char[s.length];

        var index = 0;
        for (int i = s.length-1; i >= 0 ; i--) {
            result[index] = s[i];
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}
