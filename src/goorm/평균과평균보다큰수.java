package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균과평균보다큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0f;
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(st.nextToken());
            arr[i] = num;
            sum += num;
        }

        double avg = sum / n;
        int cnt = 0;
        for (double num : arr) {
            if (num > avg) {
                cnt++;
            }
        }

        System.out.print(String.format("%.1f", avg) + " " + cnt);
    }

}
