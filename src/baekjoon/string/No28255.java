package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No28255 { //3단 초콜릿 아이스크림

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String word = br.readLine();
            String prefix = word.substring(0, (word.length()/3));

            if (word.equals(case1(prefix))) {
                System.out.println(1);
                continue;
            }

            if (word.equals(case2(prefix))) {
                System.out.println(1);
                continue;
            }

            if (word.equals(case3(prefix))) {
                System.out.println(1);
                continue;
            }

            if (word.equals(case4(prefix))) {
                System.out.println(1);
                continue;
            }

            System.out.println(0);
        }

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
        return word.substring(1, word.length());
    }

}
