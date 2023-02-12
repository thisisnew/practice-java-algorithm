package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int result = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 'X') {
                cnt = 0;
                continue;
            }

            result += ++cnt;
        }

        System.out.println(result);
        br.close();
    }
}
