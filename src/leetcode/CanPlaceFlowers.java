package leetcode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean isPlanted = false;

        for (int flower : flowerbed) {

            if (n == 0) {
                return true;
            }

            if (flower == 1) {
                continue;
            }

            if (isPlanted) {
                isPlanted = false;
            } else {
                isPlanted = true;
                n--;
            }
        }

        return false;
    }
}
