package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        var rows = Integer.parseInt(br.readLine());

        System.out.println(convert(s, rows));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (var i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        var currentRow = 0;
        var goingDown = false;

        for (var c : s.toCharArray()) {
            rows.get(currentRow).append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        var result = new StringBuilder();
        for (var row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
