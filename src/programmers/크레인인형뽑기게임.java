package programmers;

import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        ToyCraneGame toyCraneGame = new ToyCraneGame();
        System.out.println(toyCraneGame.solution(board, moves));
    }
}

class ToyCraneGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            int doll = getDoll(board, move);

            if (!basket.isEmpty() && basket.get(basket.size() - 1) == doll) {
                basket.remove(basket.size() - 1);
            }

            basket.add(doll);
        }

        return answer;
    }

    private int getDoll(int[][] board, int index) {
        int result = 0;
        int[] dolls = board[index];

        for (int i = 0; i < dolls.length; i++) {
            if (dolls[i] == 0) {
                continue;
            }

            result = dolls[i];
            dolls[i] = 0;
            break;
        }

        return result;
    }
}
