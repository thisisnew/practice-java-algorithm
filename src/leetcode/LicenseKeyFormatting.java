package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LicenseKeyFormatting {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        var k = Integer.parseInt(br.readLine());
        System.out.println(licenseKeyFormatting(s, k));
    }

    private static String licenseKeyFormatting(String s, int k) {
        return "";
    }
}
