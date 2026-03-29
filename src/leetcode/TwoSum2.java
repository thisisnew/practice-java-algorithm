package leetcode;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


    private static int[] twoSum(int[] numbers, int target) {

        boolean resolved = false;
        int[] result = new int[2];

        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    resolved = true;
                    break;
                }

                if (resolved) {
                    break;
                }
            }
        }

        return result;
    }
}
