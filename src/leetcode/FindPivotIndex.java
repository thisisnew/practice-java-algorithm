package leetcode;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sum(nums, 0, i - 1) == sum(nums, i + 1, nums.length - 1)) {
                return i;
            }
        }

        return -1;
    }

    private int sum(int[] nums, int start, int end) {
        int result = 0;

        for (int i = start; i <= end; i++) {
            result += nums[i];
        }

        return result;
    }
}
