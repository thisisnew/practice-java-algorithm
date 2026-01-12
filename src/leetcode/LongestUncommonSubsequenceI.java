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

        for (int i = a.length()-1; i >= 0; i--) {
            var aSub = a.substring(0, i);

            if (b.contains(aSub)) {
                return aSub.length();
            }
        }

        return a.length();
    }
}
