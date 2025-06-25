package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();
        String word = br.readLine();
        char firstChar = word.charAt(0);
        int wordLen = word.length();

        int lastIndex = sentence.length() - 1;
        int idx = 0;

        int count = 0;
        while (idx < lastIndex) {
            if (sentence.charAt(idx) != firstChar) {
                idx++;
                continue;
            }

            if (sentence.substring(idx, idx + wordLen).equals(word)) {
                count++;
                idx += wordLen;
            }
        }

        System.out.println(count);
        br.close();
    }
}
