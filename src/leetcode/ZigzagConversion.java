package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigzagConversion {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var s = br.readLine();
        var rows = Integer.parseInt(br.readLine());

        System.out.println(convert(s, rows));
    }

    public static String convert(String s, int numRows) {
        var zigzag = new Character[numRows][numRows];

        for (int i = 0; i < s.length(); i++) {

        }

        var colIdx = 0;
        var sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(zigzag[colIdx][i]);

            if (i == numRows - 1) {
                colIdx++;
            }
        }

        return sb.toString();
    }
}
