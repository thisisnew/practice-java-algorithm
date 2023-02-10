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

        Map<Float, List<Integer>> stageFailuresMap = new HashMap<>();
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

            if (!stageFailuresMap.containsKey(failureRatio)) {
                stageFailuresMap.put(failureRatio, new ArrayList<>(stage));
            }

            List<Integer> stageList = stageFailuresMap.get(failureRatio);
            stageList.add(stage);
            stageFailuresMap.put(failureRatio, stageList);
        }

        Collections.reverse(ratio);

        List<Integer> result = new ArrayList<>();

        for (float failureRatio : stageFailuresMap.keySet()) {
            List<Integer> stageList = stageFailuresMap.get(failureRatio);

            if (stageList.size() > 1) {
                Collections.sort(stageList);
            }

            for (int stage : stageList) {
                result.add(stage);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}