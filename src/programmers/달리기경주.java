package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> playersRankMap = getPlayersRankMap(players);

        for (String calling : callings) {

        }

        String[] answer = {};
        return answer;
    }

    private Map<String, Integer> getPlayersRankMap(String[] players) {

        Map<String, Integer> playersRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playersRank.put(players[i], i);
        }

        return playersRank;
    }
}