package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheIndexOfTheFirstOccurrence {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        line = line.replace("haystack =", "")
                .replace("needle =", "")
                .replace("\"", "")
                .replace(",", "")
                .trim();

        String[] arr = line.split("\\s+"); // 공백 기준 split
        String haystack = arr[0];
        String needle = arr[1];

        System.out.println(strStr("" ,""));
    }

    private static int strStr(String haystack, String needle) {
        return 0;
    }
}
