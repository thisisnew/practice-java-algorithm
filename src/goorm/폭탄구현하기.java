package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 폭탄구현하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] graph = new int[n + 1][n + 1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bomb(graph, a, b);
        }

        int result = 0;

        for (int i = 1; i < graph.length; i++) {
            int[] g = graph[i];

            for (int j = 1; j < g.length; j++) {
                result += g[j];
            }
        }

        System.out.println(result);
    }

    private static void bomb(int[][] graph, int a, int b) {
        graph[a][b]++;

        if (a - 1 >= 0) {
            graph[a - 1][b]++;
        }

        if (a + 1 <= graph.length - 1) {
            graph[a + 1][b]++;
        }

        if (b - 1 >= 0) {
            graph[a][b - 1]++;
        }

        if (b + 1 <= graph.length - 1) {
            graph[a][b + 1]++;
        }
    }
}
