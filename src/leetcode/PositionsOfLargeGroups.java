package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) throws IOException {
        System.out.println(largeGroupPositions(""));
    }

    private static List<List<Integer>> largeGroupPositions(String s) {

        var result = new ArrayList<List<Integer>>();
        var temp = new ArrayList<Integer>();

        var tempLetter = s.charAt(0);
        var currentIdx = 0;
        var endIdx = 0;
        var length = 1;

        for (int i = 1; i < s.length(); i++) {
            var c = s.charAt(i);

            if (c == tempLetter) {
                length++;
                endIdx = i;
                continue;
            }

            if (length >= 3) {
                temp.add(currentIdx);
                temp.add(endIdx);
                result.add(temp);
                temp = new ArrayList<>();
            }
        }

        return result;
    }
}
