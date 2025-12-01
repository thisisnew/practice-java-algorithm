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

        System.out.println(strStr(haystack ,needle));
    }

    private static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i += needle.length()) {
            
        }
        
        return 0;
    }
}
