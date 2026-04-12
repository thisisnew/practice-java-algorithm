package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> maxCandies = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
