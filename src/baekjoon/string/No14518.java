package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No14518 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println(":fan::fan::fan:");
        System.out.printf("%s%s%s%n", ":fan::",input,"::fan:");
        System.out.println(":fan::fan::fan:");

        br.close();
    }

    private static int getRequiredPlayers(String gameType) {
        return switch (gameType) {
            case "Y" -> 2;
            case "F" -> 3;
            case "O" -> 4;
            default -> throw new IllegalArgumentException();
        };
    }
}