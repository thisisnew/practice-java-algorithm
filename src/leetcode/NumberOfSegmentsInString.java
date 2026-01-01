package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfSegmentsInString {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(countSegments(br.readLine()));
    }

    private static int countSegments(String s) {
        var count = 0;

        for (var c : s.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }

        return count;
    }
}
