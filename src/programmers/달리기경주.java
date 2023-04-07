package programmers;

import java.util.Arrays;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        RunningRace runningRace = new RunningRace();
        System.out.println(Arrays.toString(runningRace.solution(players, callings)));
    }
}

class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        return answer;
    }
}