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
        int[] leftCount = new int[n + 1]; // 인덱스가 키, 값이 왼쪽에 있는 키 큰 사람 수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            leftCount[i] = Integer.parseInt(st.nextToken());
        }
        
        // 결과 리스트 (처음에는 비어있음)
        List<Integer> result = new ArrayList<>();
        
        // 키가 큰 사람부터 작은 사람 순으로 처리 (역순)
        for (int height = n; height >= 1; height--) {
            // 키가 height인 사람을 leftCount[height] 위치에 삽입
            result.add(leftCount[height], height);
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int height : result) {
            sb.append(height).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
