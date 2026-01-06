package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LicenseKeyFormatting {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        var k = Integer.parseInt(br.readLine());
        System.out.println(licenseKeyFormatting(s, k));
    }

    private static String licenseKeyFormatting(String s, int k) {

        var replaced = s.replaceAll("-", "");
        var len = replaced.length();
        var list = new ArrayList<Character[]>();

        while(len > 0) {
            if (len < k) {
                list.add(new Character[len]);
            } else {
                list.add(new Character[k]);
            }

            len -= k;
        }

        var idx = 0;
        var replacedArr = replaced.toCharArray();
        for (var i = list.size() - 1; i >= 0; i--) {
            var strings = list.get(i);

            for (int j = 0; j < strings.length; j++) {
                strings[j] = replacedArr[idx++];
            }
        }

        return "";
    }
}
