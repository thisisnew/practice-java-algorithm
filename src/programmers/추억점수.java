package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        MemorialPoint memorialPoint = new MemorialPoint();
        System.out.println(Arrays.toString(memorialPoint.solution(name, yearning, photo)));
    }
}

class MemorialPoint {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        return getResult(photo, getMemorialPointMap(name, yearning));
    }

    private Map<String, Integer> getMemorialPointMap(String[] name, int[] yearning) {

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            result.put(name[i], yearning[i]);
        }

        return result;
    }

    private int[] getResult(String[][] photo, Map<String, Integer> memorialPointMap) {
        int[] result = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            result[i] = sumPoint(photo[i], memorialPointMap);
        }

        return result;
    }

    private int sumPoint(String[] p, Map<String, Integer> memorialPointMap) {
        int result = 0;

        for (int j = 0; j < p.length; j++) {
            if (memorialPointMap.containsKey(p[j])) {
                result += memorialPointMap.get(p[j]);
            }
        }

        return result;
    }
}
