package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No20528 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] words = br.readLine().split(" ");

        String firstWord = words[0].substring(0,1);

        int flag = 1;
        for (int i=1; i<words.length; i++) {
            if (!firstWord.equals(words[i].substring(0,1))) {
                flag = 0;
                break;
            }
        }

        System.out.println(flag);
    }
}
