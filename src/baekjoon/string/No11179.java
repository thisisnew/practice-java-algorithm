package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No11179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            queue.add(n % 2);
            n /= 2;
        }

        int result = 0;
        int i = 0;
        while (!queue.isEmpty()) {
            result += (int) Math.pow(2, i) * queue.poll();
            i++;
        }

        System.out.println(result);
        br.close();
    }

}