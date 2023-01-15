package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배열에서의최솟값구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n - 1; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
