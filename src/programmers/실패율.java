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
        Map<Float, List<Integer>> stageFailuresMap = getStageFailuresMap(N, stages);
        List<Float> ratio = getFailureRatioListReverseOrder(stageFailuresMap);

        return getFailureStageList(ratio, stageFailuresMap)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private Map<Float, List<Integer>> getStageFailuresMap(int N, int[] stages) {
        Map<Float, List<Integer>> result = new HashMap<>();

        for (int stage = 1; stage <= N; stage++) {
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

            float failureRatio = (float) failureCnt / totalCnt;

            if (!result.containsKey(failureRatio)) {
                List<Integer> stageList = new ArrayList<>();
                stageList.add(stage);
                result.put(failureRatio, stageList);
                continue;
            }

            List<Integer> stageList = result.get(failureRatio);
            stageList.add(stage);
            result.put(failureRatio, stageList);
        }

        return result;
    }

    private List<Float> getFailureRatioListReverseOrder(Map<Float, List<Integer>> stageFailuresMap) {
        List<Float> result = new ArrayList<>();

        for (float failureRatio : stageFailuresMap.keySet()) {
            result.add(failureRatio);
        }

        Collections.sort(result, Collections.reverseOrder());

        return result;
    }

    private List<Integer> getFailureStageList(List<Float> ratio, Map<Float, List<Integer>> stageFailuresMap) {
        List<Integer> result = new ArrayList<>();

        for (float r : ratio) {
            List<Integer> stageList = stageFailuresMap.get(r);

            if (stageList.size() > 1) {
                Collections.sort(stageList);
            }

            for (int stage : stageList) {
                result.add(stage);
            }
        }

        return result;
    }
}