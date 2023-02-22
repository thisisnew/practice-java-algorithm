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
//            int idx1 = findIndexIfHasSameProperty(cards1, g);
//
//            if (idx1 >= 0) {
//                cards1 = removePropInArray(cards1, idx1);
//                continue;
//            }
//
//
//            int idx2 = findIndexIfHasSameProperty(cards2, g);
//
//            if (idx2 >= 0) {
//                cards2 = removePropInArray(cards2, idx2);
//                continue;
//            }

            answer = NO;
            break;
        }

        return answer;
    }

    private int findIndexIfHasSameProperty(String[] cards, String g) {

        int result = -1;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == g) {
                result = i;
                break;
            }
        }

        return result;
    }

    private String[] removePropInArray(String[] cards, int idx) {

        String[] result = new String[cards.length - 1];
        int index = 0;

        for (int i = 0; i < cards.length; i++) {

            if (i == idx) {
                continue;
            }

            result[index] = cards[i];
            index++;
        }

        return result;
    }
}