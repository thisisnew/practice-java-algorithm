package leetcode;

public class CountingBits {
    public int[] countBits(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = i;
            int count = 0;

            while(temp > 0) {
                temp = temp / 2;
                count++;
            }

            result[i] = count;
        }

        return result;
    }
}
