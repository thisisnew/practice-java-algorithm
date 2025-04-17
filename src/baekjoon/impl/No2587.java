package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2587 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            int[] arr = new int[5];

            // 5개 정수 입력 받기
            for (int i = 0; i < 5; i++) {
                int n = Integer.parseInt(br.readLine());
                sum += n;
                arr[i] = n;
            }

            Arrays.sort(arr);

            System.out.println(sum / 5);
            System.out.println(arr[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
