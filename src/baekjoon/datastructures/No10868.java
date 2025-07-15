package baekjoon.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No10868 {

    private static final String STR_ENTER = "ENTER";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] numbers = new int[m];

        for (int i = 0; i < m; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {

        }

        br.close();
    }

}
