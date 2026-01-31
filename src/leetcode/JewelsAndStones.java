package leetcode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

public class JewelsAndStones {
    public static void main(String[] args) throws IOException {
        System.out.println(numJewelsInStones("", ""));
    }

    private static int numJewelsInStones(String jewels, String stones) {

        var queue = new LinkedList<Character>();
        for(var s : stones.toCharArray()) queue.add(s);

        var count = 0;

        for(var j : jewels.toCharArray()) {
            var idx = 0;
            while(idx < queue.size()) {
                var pop = queue.pop();

                if (Objects.equals(j, pop)) {
                    count++;
                } else {
                    queue.add(pop);
                }

                idx++;
            }
        }

        return count;
    }
}
