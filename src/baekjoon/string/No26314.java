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
            int vowelCnt = countVowel(s);
            int consonantCnt = s.length() - vowelCnt;

            System.out.println(s);
            System.out.println(result(vowelCnt, consonantCnt));
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

    private static int result(int vowelCnt, int consonantCnt) {
        return vowelCnt > consonantCnt ? 1 : 0;
    }
}