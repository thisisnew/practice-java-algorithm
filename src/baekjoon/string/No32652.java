package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32652 {

    private static final String AKARAKA = "AKARAKA";
    private static final String RAKA = "RAKA";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        System.out.println(AKARAKA + RAKA.repeat(Math.max(0, k - 1)));
        br.close();
    }

}