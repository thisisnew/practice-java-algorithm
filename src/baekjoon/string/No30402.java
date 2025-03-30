package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No30402 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean find = false;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            switch (s) {
                case "w" -> {
                    System.out.println("chunbae");
                    find = true;
                }
                case "b" -> {
                    System.out.println("nabi");
                    find = true;
                }
                case "g" -> {
                    System.out.println("yeongcheol");
                    find = true;
                }
            }

            if (find) {
                break;
            }
        }
    }
}
