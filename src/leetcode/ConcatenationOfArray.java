package leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        var concat = new ConcatenationOfArray();
        System.out.println(Arrays.toString(concat.getConcatenation(new int[]{1,3,2,1})));
    }

    private int[] getConcatenation(int[] nums) {
        var result = new int[nums.length * 2];

        var idx = 0;
        for (int i = 0; i < nums.length * 2; i++) {
            result[i] = nums[idx++];

            if (idx == nums.length) {
                idx = 0;
            }
        }

        return result;
    }
}
