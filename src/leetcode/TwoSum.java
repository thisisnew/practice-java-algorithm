package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static final Map<Integer, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            var v = target - nums[i];

            if (MAP.containsKey(v)) {
                return new int[]{MAP.get(v), i};
            }

            MAP.put(nums[i], i);
        }

        return new int[]{};
    }
}
