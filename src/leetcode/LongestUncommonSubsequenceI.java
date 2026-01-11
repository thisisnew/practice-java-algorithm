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

        for (int i = b.length()-1; i >= 0; i--) {
            var bSub = b.substring(0, i);
            var bLen = bSub.length();

            for (int j = 0; j < a.length(); j+=bLen) {
                var aSub = a.substring(j, j + bLen);

                if (aSub.equals(bSub)) {
                    return bLen; // todo
                }
            }
        }

        return Math.max(a.length(), b.length());
    }
}
