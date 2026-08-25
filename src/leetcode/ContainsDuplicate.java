package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        var set = new HashSet<>();

        for (var num: nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
