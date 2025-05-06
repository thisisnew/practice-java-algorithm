package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No30822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();

        int uCnt = 0;
        int oCnt = 0;
        int sCnt = 0;
        int pCnt = 0;
        int cCnt = 0;

        for (int i = 0; i < n; i++) {
            switch (input.charAt(i)) {
                case 'u': uCnt++; break;
                case 'o': oCnt++; break;
                case 's': sCnt++; break;
                case 'p': pCnt++; break;
                case 'c': cCnt++; break;
                default: break;
            }
        }

        int[] arr = { uCnt, oCnt, sCnt, pCnt, cCnt };
        Arrays.sort(arr);

        System.out.println(arr[0]);
        br.close();
    }
}