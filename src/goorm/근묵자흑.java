package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 근묵자흑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int startIndex = 0;
        int cnt = 0;
        while (startIndex < arr.length - 1) {
            startIndex = replaceNumbers(arr, startIndex, k);
            cnt++;
        }

        System.out.println(cnt);
    }

    private static int replaceNumbers(int[] arr, int startIndex, int k) {
        int minValue = arr[0];

        int endIndex = Math.min(startIndex + k - 1, arr.length - 1);

        for (int i = startIndex; i <= endIndex; i++) {
            arr[i] = minValue;
        }

        return endIndex;
    }
}
