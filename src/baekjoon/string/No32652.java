package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<k; i++) {

            if (i == 0 ) {
                sb.append("AKARAKA");
                continue;
            }

            sb.append("RAKA");
        }

        sb.deleteCharAt(sb);
        br.close();
    }

}