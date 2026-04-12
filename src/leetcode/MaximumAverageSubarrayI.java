package leetcode;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }

    private int sum(int[] nums, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            result += nums[i];
        }

        return result;
    }
}
