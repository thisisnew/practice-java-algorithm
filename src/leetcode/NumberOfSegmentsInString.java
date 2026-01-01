package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class NumberOfSegmentsInString {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(countSegments(br.readLine()));
    }

    private static int countSegments(String s) {
        var list = new ArrayList<String>();

        var split = s.split(" ");

        for (var sp : split) {
            if (Objects.nonNull(sp) && !sp.isBlank()) {
                list.add(sp);
            }
        }

        return list.size();
    }
}
