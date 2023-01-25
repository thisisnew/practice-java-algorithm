package programmers;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
    }

    private static String solution(String[] participant, String[] completion) {
        return getIncompleteMember(exceptionCompletion(getParticipantMap(participant), completion));
    }

    private static Map<String, Integer> getParticipantMap(String[] participant) {
        Map<String, Integer> result = new HashMap<>();

        for (String pt : participant) {
            if (!result.containsKey(pt)) {
                result.put(pt, 1);
                continue;
            }

            int cnt = result.get(pt);
            result.put(pt, ++cnt);
        }

        return result;
    }

    private static Map<String, Integer> exceptionCompletion(Map<String, Integer> participantMap, String[] completion) {
        Map<String, Integer> result = participantMap;

        for (String cp : completion) {
            int cnt = result.get(cp);
            result.put(cp, --cnt);
        }

        return result;
    }

    private static String getIncompleteMember(Map<String, Integer> participantMap) {

        Map<String, Integer> result = participantMap;
        String answer = "";

        for (String key : result.keySet()) {
            int cnt = result.get(key);

            if (cnt > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
