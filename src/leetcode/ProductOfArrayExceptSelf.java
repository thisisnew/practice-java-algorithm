package leetcode;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4}));
    }

    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int mul = 1;
            for (int j = 0; j < i; j++) {
                mul *= nums[j];
            }

            left[i] = mul;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int mul = 1;
            for (int j = i-1; j >= 0; j--) {
                mul *= nums[j];
            }

            right[i] = mul;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < left.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
