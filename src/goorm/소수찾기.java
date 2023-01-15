package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (!isPrimeNumber(i)) {
                continue;
            }

            result += num;
        }

        System.out.println(result);

    }

    static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
