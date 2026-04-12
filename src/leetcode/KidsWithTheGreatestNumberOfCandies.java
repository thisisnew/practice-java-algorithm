package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> maxCandies = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            int count = candies[i];

            if (count > max) {
                max = count;
            }

            maxCandies.add(count+extraCandies);
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < maxCandies.size(); i++) {
            if (maxCandies.get(i) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
