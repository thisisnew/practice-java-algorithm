package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 1; i * i <= n; i++) {

            if (i * i == n) {
                sum += i;
                continue;
            }

            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }

        System.out.println(sum);
    }
}
