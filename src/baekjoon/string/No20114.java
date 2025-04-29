package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] arr = new char[h][n*w];

        for (int i=0; i<h; i++) {
            char[] characters = br.readLine().toCharArray();
            System.arraycopy(characters, 0, arr[i], 0, characters.length);
        }

        for (int i=0; i<arr.length; i++) {
            char[] chars = arr[i];

            System.out.println(chars.toString());
        }

        br.close();
    }
}