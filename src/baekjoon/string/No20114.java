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

        String[] result = {"?", "?", "?"};

        for (int i=0; i<inputArr.length; i++) {
            int resultIdx = 0;
            String input = inputArr[i];
            int inputStartIdx = 0;

            while(inputStartIdx + w <= input.length() - 1) {
                String substring = input.substring(inputStartIdx, inputStartIdx + w);

                for (char c : substring.toCharArray()) {
                    if (c != '?') {
                        result[resultIdx] = String.valueOf(c);
                    }
                }

                resultIdx++;
                inputStartIdx += w;
            }
        }

        System.out.println(Arrays.toString(result));

        br.close();
    }
}