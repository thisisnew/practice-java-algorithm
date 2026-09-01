package leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        var runningSum = new RunningSumOf1dArray();
        System.out.println(Arrays.toString(runningSum.runningSum(new int[]{1, 2, 3, 4})));
    }

    public int[] runningSum(int[] nums) {
        var result = new int[nums.length];

        var num = 0;

        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
            result[i] = num;
        }

        return result;
    }
}
