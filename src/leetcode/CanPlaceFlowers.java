package leetcode;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 1) {
                continue;
            }

            if (n == 0) {
                return true;
            }

            if (i == 0) {
                if (flowerbed.length == 1) {
                    flowerbed[i] = 1;
                    n--;
                    return n == 0;
                }

                if (flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    continue;
                }
            }

            if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }

            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

        }

        return n <= 0;
    }
}
