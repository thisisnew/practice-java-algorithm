package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] leftHigher = new int[n + 1]; // 키가 i인 사람의 왼쪽에 있는 키 큰 사람 수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            leftHigher[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(leftHigher[i], i);
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int height : result) {
            sb.append(height).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
