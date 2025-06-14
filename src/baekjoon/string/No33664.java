package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No33664 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken()); // 토카의 보유 금액
        int n = Integer.parseInt(st.nextToken()); // 아이템의 수
        int m = Integer.parseInt(st.nextToken()); // 구매하려는 아이템의 수

        br.close();
    }
}