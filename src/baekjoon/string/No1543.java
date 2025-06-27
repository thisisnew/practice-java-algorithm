package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();
        String word = br.readLine();
        
        int count = 0;
        int idx = 0;
        
        while (idx <= sentence.length() - word.length()) {
            if (sentence.startsWith(word, idx)) {
                count++;
                idx += word.length();
            } else {
                idx++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
