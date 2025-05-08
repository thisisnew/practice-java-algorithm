package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No17202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] phoneNum = new int[16];

        for (int i = 0; i < a.length(); i++) {
            phoneNum[a.charAt(i) - '0']++;
        }


        br.close();
    }
}