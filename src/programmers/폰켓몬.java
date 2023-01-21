package programmers;

import java.util.HashMap;
import java.util.Map;

public class 폰켓몬 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{}));
    }

    private static int solution(int[] nums) {
        
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }

            map.put(num, true);
        }

        return map.size();
    }

}
