package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr_2023 = { '2', '0', '2', '3' };

        if (n < 2023) {
            System.out.println(0);
        } else {
            int result  = 0;

            for (int i = 2023; i < n; i++) {
                String value = String.valueOf(i);
                int idx = 0;

                for (int j = 0; j < value.length(); j++) {
                    char c = value.charAt(j);

                    if (c == arr_2023[idx]) {
                        idx++;

                        if (idx == 4) {
                            result++;
                            break;
                        }
                    }
                }
            }

            System.out.println(result);
        }

        br.close();
    }
}