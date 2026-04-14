package leetcode;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1,2,3,4,5}));
    }

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= first) {
                first = num;
                continue;
            }

            if (num <= second) {
                second = num;
                continue;
            }

            return true;
        }

        return false;
    }
}
