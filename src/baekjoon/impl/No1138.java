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
        int[] leftCount = new int[n + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            leftCount[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> result = new ArrayList<>();

        for (int height = n; height >= 1; height--) {
            result.add(leftCount[height], height);
        }

        StringBuilder sb = new StringBuilder();

        for (int height : result) {
            sb.append(height).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
