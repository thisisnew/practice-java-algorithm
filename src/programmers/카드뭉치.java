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

        for (String g : goal) {
            if (isTopPropAsSameAsThisProp(cards1, g)) {
                cards1 = removePropInArray(cards1);
                continue;
            }
            
            if (isTopPropAsSameAsThisProp(cards2, g)) {
                cards2 = removePropInArray(cards2);
                continue;
            }

            answer = NO;
            break;
        }

        return answer;
    }

    private boolean isTopPropAsSameAsThisProp(String[] cards, String g) {
        return cards[0] == g;
    }

    private String[] removePropInArray(String[] cards) {

        String[] result = new String[cards.length - 1];
        int index = 0;

        for (int i = 1; i < cards.length; i++) {
            result[index] = cards[i];
            index++;
        }

        return result;
    }
}