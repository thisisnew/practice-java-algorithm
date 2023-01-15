package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                result.add(i);
                continue;
            }

            if (n % i == 0) {
                result.add(i);
                result.add(n / i);
            }
        }

        Collections.sort(result);

        for (int answer : result) {
            System.out.print(answer + " ");
        }
    }
}
