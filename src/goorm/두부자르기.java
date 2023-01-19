package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 두부자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Boolean> slice = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            int cnt = n / i;

            if (slice.containsKey(cnt)) {
                continue;
            }

            slice.put(cnt, true);
        }

        System.out.println(slice.size());
    }
}
