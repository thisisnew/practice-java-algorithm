package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static final Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            var v = target - nums[i];

            if (map.containsKey(v)) {
                return new int[]{map.get(v), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
