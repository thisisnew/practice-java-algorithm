package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No30402 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean find = false;

        for(int i = 0; i<15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < st.countTokens(); j++) {
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

            if (find) {
                break;
            }
        }
    }
}
