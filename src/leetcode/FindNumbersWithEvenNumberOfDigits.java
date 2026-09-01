package leetcode;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        var ans = 0;

        for (var num : nums) {
            if (isEvenDigit(num)) {
                ans++;
            }
        }

        return ans;
    }

    private boolean isEvenDigit(int num) {
        var digit = 0;

        while (num != 0) {
            num /= 10;
            digit++;
        }

        return digit % 2 == 0;
    }
}
