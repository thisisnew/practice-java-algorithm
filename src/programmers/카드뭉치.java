package programmers;

public class 카드뭉치 {
    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(deck.solution(cards1, cards2, goal));
    }
}

class Deck {

    private final static String YES = "Yes";
    private final static String NO = "No";

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = YES;
        

        return answer;
    }

    private String[] removePropInArray(String[] cards, int idx) {

        String[] result = new String[cards.length - 1];
        int index = 0;

        for (int i = 0; i < cards.length; i++) {

            if (i == idx) {
                continue;
            }

            result[index] = cards[idx];
        }

        return result;
    }
}