package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class No28064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int res = 0;

        for (String pre : arr) {
            for (String post : arr) {
                if (Objects.equals(pre, post)) {
                    continue;
                }

                if (availableToConnect(pre, post)) {
                    res++;
                }
            }
        }

        br.close();
    }

    private static boolean availableToConnect(String pre, String post) {
        return true;
    }
}