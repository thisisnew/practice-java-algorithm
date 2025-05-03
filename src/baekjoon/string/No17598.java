package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No17598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tigerCnt = 0;
        int lionCnt = 0;
        String result = "Tiger";

        for(int i=0; i<9; i++) {
            if (br.readLine().equals("Lion")) {
                lionCnt++;
            } else {
                tigerCnt++;
            }

            if (lionCnt == 5) {
                result = "Lion";
                break;
            }

            if (tigerCnt == 5) {
                break;
            }
        }

        System.out.println(result);
        br.close();
    }
}