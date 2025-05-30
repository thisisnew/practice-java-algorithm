package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25640 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (br.readLine().equals(input)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}