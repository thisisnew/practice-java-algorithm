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

        var replaced = s.replaceAll("-", "").toCharArray();
        var len = replaced.length;
        var list = new ArrayList<Integer>();

        while(len > 0) {
            list.add(Math.min(len, k));
            len -= k;
        }

        var idx = 0;
        var sb = new StringBuilder();

        for (var i = list.size() - 1; i >= 0; i--) {
            var temp = new StringBuilder();

            for (int j = 0; j < list.get(i); j++) {
                var v = replaced[idx++] + "";
                temp.append(v.toUpperCase());
            }

            sb.append(temp).append("-");
        }

        var result = sb.toString();
        var last = Math.max(result.length() - 1, 0);

        return result.substring(0, last);
    }
}
