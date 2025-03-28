package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11575 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 문제 수
        int m = Integer.parseInt(st.nextToken());   // 출제위원
        int half = (m + 1) / 2;
        int result = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int count = 0;

            for(char c : s.toCharArray()) {
                if(c == 'O') {
                    count++;

                    if (count == half) {
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
