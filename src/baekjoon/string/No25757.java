package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        int numberOfPlay = requiredNumberOfPlay(game);

        Set<String> players = new HashSet<>();

        for (int i = 0; i < n; i++) {
            players.add(br.readLine());
        }

        System.out.println(players.size() / (numberOfPlay-1));
    }

    private static int requiredNumberOfPlay(String game) {
        return switch (game) {
            case "Y" -> 2;
            case "F" -> 3;
            case "O" -> 4;
            default -> throw new IllegalArgumentException();
        };
    }
}
