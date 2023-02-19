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
        List<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            int doll = getDoll(board, move - 1);

            int top = getTopIndexOfBasket(basket);
            if (!basket.isEmpty() && basket.get(top) == doll) {
                basket.remove(top);
                continue;
            }

            basket.add(doll);
        }

        return getBasketSize(basket);
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

    private int getTopIndexOfBasket(List<Integer> basket) {

        int result = 0;

        for (int i = basket.size() - 1; i >= 0; i--) {
            if (basket.get(i) != 0) {
                result = i;
                break;
            }
        }

        return result;
    }

    private int getBasketSize(List<Integer> basket) {

        int result = 0;

        for (int v : basket) {
            if (v == 0) {
                continue;
            }

            result++;
        }

        return result;
    }
}
