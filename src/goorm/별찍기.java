package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int idx = n - 1;
        boolean isMiddle = false;

        for (int i = 0; i < (n * 2) - 1; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (j < idx) {
                    sb.append(" ");
                    continue;
                }

                sb.append("*");
            }

            System.out.println(sb);
            sb = new StringBuilder();

            if (isMiddle) {
                idx++;
            } else {
                idx--;
            }

            if (idx == 0) {
                isMiddle = true;
            }
        }
    }
}
