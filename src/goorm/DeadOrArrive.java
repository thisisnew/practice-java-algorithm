package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DeadOrArrive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, int[]> cars = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if (!cars.containsKey(v)) {
                cars.put(v, new int[]{i + 1, w});
                continue;
            }

            if (cars.get(v)[1] <= w) {
                cars.get(v)[0] = i + 1;
                cars.get(v)[1] = w;
            }
        }

        int totalCarNums = 0;

        for (int v : cars.keySet()) {
            totalCarNums += cars.get(v)[0];
        }

        System.out.println(totalCarNums);
    }
}
