package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합격자찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] points = new int[n];
            double totalPoint = 0;

            for (int j = 0; j < n; j++) {
                int point = Integer.parseInt(st.nextToken());
                totalPoint += point;
                points[j] = point;
            }

            double averagePoint = totalPoint / n;
            int higherMemberThanAveragePoint = 0;

            for (int p : points) {
                if (p >= averagePoint) {
                    higherMemberThanAveragePoint++;
                }
            }

            System.out.println(higherMemberThanAveragePoint + "/" + n);
        }
    }
}
