package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No11179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            list.add(n % 2);
            n /= 2;
        }

        int result = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            result += (int) Math.pow(2, (list.size() - 1) - i) * list.get(i);
        }

        System.out.println(result);
        br.close();
    }
}