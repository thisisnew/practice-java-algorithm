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

        //char[] arr = new char[];
        for (int i = 0; i< inputArr.length; i++) {
            char[] chars = inputArr[i];

            for (int j=0; j<inputArr[i].length; j++) {
                System.out.print(inputArr[i][j]);
            }

            System.out.println();
        }

        br.close();
    }
}