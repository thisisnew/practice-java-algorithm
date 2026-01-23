package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBinarySubstrings {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(countBinarySubstrings(br.readLine()));
    }

    private static int countBinarySubstrings(String s) {

        var zeroCnt = 0;
        var oneCnt = 0;

        for (var c : s.toCharArray()) {
            if (c == '0') {
                zeroCnt++;
            } else {
                oneCnt++;
            }
        }

        var min = Math.min(zeroCnt, oneCnt);

        for (var c : s.toCharArray()) {

        }



        return 0;
    }
}
