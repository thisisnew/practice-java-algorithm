package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var value = target - nums[i];

            if (map.containsKey(value)) {
                return new int[]{i , map.get(value)};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
