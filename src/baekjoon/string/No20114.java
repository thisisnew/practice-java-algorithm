package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        String[] inputArr = new String[h];

        for (int i=0; i<h; i++) {
            inputArr[i] = br.readLine();
        }

        String[] result = new String[n];
        Arrays.fill(result, "?");

        for (String input : inputArr) {
            int resultIdx = 0;
            int inputStartIdx = 0;

            while (inputStartIdx + w <= input.length()) {
                String substring = input.substring(inputStartIdx, inputStartIdx + w);

                for (char c : substring.toCharArray()) {
                    if (c != '?') {
                        result[resultIdx] = String.valueOf(c);
                        break;
                    }
                }

                resultIdx++;
                inputStartIdx += w;
            }
        }

        System.out.println(String.join("", result));
        br.close();
    }
}