package leetcode;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    private static void moveZeroes(int[] nums) {

        var idx = 0;
        for (var i = 0; i<nums.length; i++) {
            var num = nums[i];

            if (num != 0) {
                nums[idx++] = num;
            }
        }

        for (var i = idx; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
