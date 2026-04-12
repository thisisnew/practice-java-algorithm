package leetcode;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<gain.length - 1; i++) {
            int diff = gain[i] + gain[i + 1];

            if (diff > max) {
                max = diff;
            }
        }

        return max;
    }
}
