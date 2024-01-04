package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No28255 { //3단 초콜릿 아이스크림

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String word = br.readLine();

            if (isThirdGradeIceCream(word)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }

    private static boolean isThirdGradeIceCream(String word) {
        String prefix = getPrefix(word);

        if (word.equals(case1(prefix))) {
            return true;
        }

        if (word.equals(case2(prefix))) {
            return true;
        }

        if (word.equals(case3(prefix))) {
            return true;
        }

        if (word.equals(case4(prefix))) {
            return true;
        }

        return false;
    }

    private static String getPrefix(String word) {

        int len = word.length();

        if (len % 3 == 0) {
            return word.substring(0, len/3);
        }

        return word.substring(0, len/3+1);
    }

    private static String case1(String prefix) {
        return prefix + rev(prefix) + prefix;
    }

    private static String case2(String prefix) {
        return prefix + tail(rev(prefix)) + prefix;
    }

    private static String case3(String prefix) {
        return prefix + rev(prefix) + tail(prefix);
    }

    private static String case4(String prefix) {
        return prefix + tail(rev(prefix)) + tail(prefix);
    }

    private static String rev(String word) {

        StringBuilder result = new StringBuilder(word.length());

        for (int i=word.length()-1; i>=0; i--) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }

    private static String tail(String word) {
        return word.substring(1);
    }

}
