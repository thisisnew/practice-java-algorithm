package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] inputArr = new char[h][n*w];

        for (int i=0; i<h; i++) {
            char[] characters = br.readLine().toCharArray();
            System.arraycopy(characters, 0, inputArr[i], 0, characters.length);
        }

        char[] result = new char[n];
        int letterIdx = 0;

        for (int i=0; i<inputArr.length; i++) {
            char[] chars = inputArr[i];

            int idx = 0;
            char c = '?';

            for (char ch : chars) {
                idx++;

                if (ch != '?') {
                    c = ch;
                }

                if (idx == w) {
                    result[letterIdx] = c;
                    letterIdx++;
                    idx = 0;
                }
            }

            if (i < inputArr.length -1) {
                System.out.println();
            }

            letterIdx = 0;
        }

        for (char c: result) {
            System.out.print(c);
        }

        br.close();
    }
}