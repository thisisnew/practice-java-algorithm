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

        for(var s : stones.toCharArray()) {
            queue.add(s);
        }

        var result = 0;

        for(var j : jewels.toCharArray()) {
            var pop = queue.pop();

            if (Objects.equals(j, pop)) {
                result++;
            } else {
                queue.add(pop);
            }
        }

        return result;
    }
}
