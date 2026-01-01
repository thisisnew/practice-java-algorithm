package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberOfSegmentsInString {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(countSegments(br.readLine()));
    }

    private static int countSegments(String s) {
        var list = new ArrayList<String>();

        var sb = new StringBuilder();
        for (var i=0; i<s.length();i++) {
            var c = s.charAt(i);

            if (i < s.length()-1 && c != ' ') {
                sb.append(c);
                continue;
            }

            list.add(sb.toString());
        }

        return list.size();
    }
}
