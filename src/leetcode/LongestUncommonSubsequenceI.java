package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestUncommonSubsequenceI {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(findLUSlength(br.readLine(), br.readLine()));
    }

    private static int findLUSlength(String a, String b) {
        var bLen = b.length();

        for (int i = 0; i < a.length(); i+=bLen) {
            var aSub = a.substring(i, i + bLen);


        }

        return 0;
    }
}
