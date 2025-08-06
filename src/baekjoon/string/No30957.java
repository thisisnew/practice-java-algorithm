package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No30957 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int bCnt = 0;
        int sCnt = 0;
        int aCnt = 0;

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);

            switch (c) {
                case 'A': aCnt++; break;
                case 'B': bCnt++; break;
                case 'S': sCnt++; break;
                default: break;
            }
        }


        br.close();
    }

}