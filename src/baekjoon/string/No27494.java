package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr_2023 = { 2, 0, 2, 3 };

        if (n < 2023) {
            System.out.println(0);
        } else {
            int result  = 0;

            loop: for (int i = 2023; i < n; i++) {
                int idx = 3;
                int div = 10;

                while (i / div > 0) {
                    if (i % div == arr_2023[idx]) {
                        idx--;
                    }

                    if (idx == -1) {
                        result++;
                        break loop;
                    }

                    div *= 10;
                }
            }

            System.out.println(result);
        }

        br.close();
    }
}