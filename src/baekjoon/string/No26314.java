package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No26314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int len = s.length();
            int countedVowel = countVowel(s);

            System.out.println(s);

            if (countedVowel > (len - countedVowel)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        br.close();
    }

    private static int countVowel(String s) {
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result++;
            }
        }

        return result;
    }
}