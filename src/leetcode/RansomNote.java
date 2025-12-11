package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RansomNote {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();
        System.out.println(canConstruct(a, b));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        return false;
    }
}
