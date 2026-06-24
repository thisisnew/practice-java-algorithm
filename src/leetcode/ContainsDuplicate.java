package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    private static final Set<Integer> SET = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        for (var num: nums) {
            if (SET.contains(num)) {
                return true;
            }

            SET.add(num);
        }

        return false;
    }
}
