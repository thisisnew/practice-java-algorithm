package leetcode;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean isPlanted = false;

        for (int flower : flowerbed) {

            if (n == 0) {
                return true;
            }

            if (flower == 1) {
                isPlanted = true;
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
