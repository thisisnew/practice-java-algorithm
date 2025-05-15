package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No11179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        int result = 0;
        int i = 0;
        while (!stack.isEmpty()) {
            result += (int) Math.pow(2, i) * stack.pop();
            i++;
        }

        System.out.println(result);
        br.close();
    }
}