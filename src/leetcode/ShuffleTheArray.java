package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        var shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public int[] shuffle(int[] nums, int n) {

        var result = new int[nums.length];
        var idx = 0;
        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[i + n];
        }

        return result;
    }
}
