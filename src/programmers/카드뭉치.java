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
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        return answer;
    }
}