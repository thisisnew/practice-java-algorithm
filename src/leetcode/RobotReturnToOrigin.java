package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotReturnToOrigin {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(judgeCircle(br.readLine()));
    }

    private static boolean judgeCircle(String moves) {
        var start = new int[]{0, 0};

        for (var move : moves.toCharArray()) {
            switch (move) {
                case 'R' -> start[0]++;
                case 'L' -> start[0]--;
                case 'U' -> start[1]++;
                case 'D' -> start[1]--;
            }
        }

        return start[0] == 0 && start[1] == 0;
    }
}
