package programmers;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        FailureRatio failureRatio = new FailureRatio();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(failureRatio.solution(N, stages)));
    }
}

class FailureRatio {

    public int[] solution(int N, int[] stages) {

        int[] answer = {};
        Map<Float, Integer> stageFailuresMap = new HashMap<>();
        List<Float> ratio = new ArrayList<>();

        for (int stage = 1; stage <= N + 1; stage++) {

            int failureCnt = 0;
            int totalCnt = 0;

            for (int failureStage : stages) {
                if (failureStage < stage) {
                    continue;
                }

                if (failureStage == stage) {
                    failureCnt++;
                }

                totalCnt++;
            }

            float failureRatio = failureCnt / totalCnt;
            ratio.add(failureRatio);

            stageFailuresMap.put(failureRatio, stage);
        }

        Collections.reverse(ratio);

        return answer;
    }


}