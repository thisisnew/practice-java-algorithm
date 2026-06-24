package leetcode;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    private static int[][] transpose(int[][] matrix) {

        var m = matrix.length;
        var n = matrix[0].length;
        var result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

}
