package leetcode;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1, str2);
        return str1.substring(0, gcd);
    }

    private int gcd(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        while(len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }

        return len1;
    }
}
