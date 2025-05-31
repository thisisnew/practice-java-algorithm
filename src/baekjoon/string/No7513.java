package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No7513 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int m = Integer.parseInt(br.readLine());

            String[] words = new String[m];

            for (int j = 0; j < m; j++) {
                words[j] = br.readLine();
            }

            int n = Integer.parseInt(br.readLine());

            String scenario = String.format("Scenario #%d:%n", i+1);
            System.out.print(scenario);

            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());

                for (int l = 0; l < k; l++) {
                    sb.append(words[Integer.parseInt(st.nextToken())]);
                }

                System.out.println(sb);
            }

            if (i < t-1) {
                System.out.println();
            }
        }
        
        br.close();
    }
}