package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfLinesToWriteString {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(numberOfLines(new int[]{}, "")));
    }

    private static int[] numberOfLines(int[] widths, String s) {

        var list = new ArrayList<Character>();
        var sum = 0;

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            var pixel = widths[c - 'a'];

            if (sum + pixel <= 100) {
                sum += pixel;
                list.add(c);
                continue;
            }

            sum = 0;
            list = new ArrayList<>();
        }


        return new int[]{};
    }
}
