package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 등차등비수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (((arr[1] / arr[0]) == (arr[2] / arr[1])) && ((arr[2] / arr[1]) == (arr[3] / arr[2]))) {
            System.out.println(arr[3] * (arr[1] / arr[0]));
        } else {
            System.out.println(arr[3] + (arr[1] - arr[0]));
        }
    }
}
