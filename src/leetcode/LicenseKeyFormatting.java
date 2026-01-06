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
        var list = new ArrayList<String[]>();

        while(len > 0) {
            if (len < k) {
                list.add(new String[len]);
            } else {
                list.add(new String[k]);
            }

            len -= k;
        }

        for (var i = list.size() - 1; i >= 0; i--) {



        }

        return "";
    }
}
