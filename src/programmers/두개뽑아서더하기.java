package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{5, 0, 2, 7})));
    }
}

class Solution {
    public int[] solution(int[] numbers) {

        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int tot = numbers[i] + numbers[j];

                if (map.containsKey(tot)) {
                    continue;
                }

                map.put(tot, true);
            }
        }

        int[] answer = new int[map.size()];
        int idx = 0;

        for (int key : map.keySet()) {
            answer[idx] = key;
            idx++;
        }

        Arrays.sort(answer);

        return answer;
    }
}