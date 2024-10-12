package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1120 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
        String a = br.readLine();
        String b = br.readLine();
        int result = Integer.MAX_VALUE;

        int aLen = a.length();
        int bLen = b.length();

        for (int i=0; i <= bLen-aLen; i++) {
            String sub = b.substring(i, i+aLen);
            int dif = 0;

            for (int j=0; j<aLen; j++) {
                if (a.charAt(j) != sub.charAt(j)) {
                    dif++;
                }
            }

            result = Math.min(result, dif);
        }

        System.out.print(result);
    }
}
