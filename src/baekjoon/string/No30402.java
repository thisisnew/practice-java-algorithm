package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No30402 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        if (st.hasMoreTokens()) {
            String s = st.nextToken();

            if (s.equals("w")) {
                System.out.println("chunbae");
                return;
            }

            if (s.equals("b")) {
                System.out.println("nabi");
                return;
            }

            if (s.equals("g")) {
                System.out.println("yeongcheol");
                return;
            }

        } else {
            st = new StringTokenizer(br.readLine());
        }
    }
}
