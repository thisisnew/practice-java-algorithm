package programmers;

import java.util.Arrays;

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
        int[] answer = {};
        return answer;
    }
}
