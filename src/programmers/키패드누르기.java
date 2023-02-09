package programmers;

import java.util.HashMap;
import java.util.Map;

public class 키패드누르기 {
    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(keyPad.solution(numbers, hand));
    }
}

class KeyPad {

    private static final String RIGHT = "R";
    private static final String LEFT = "L";

    public String solution(int[] numbers, String hand) {

        StringBuilder result = new StringBuilder(numbers.length);
        Map<String, Integer> position = new HashMap<>();
        position.put(RIGHT, -1);
        position.put(LEFT, -1);

        for (int i = 0; i < numbers.length; i++) {
            String clickHand = getClickHand(numbers[i], position, hand);
            position.put(clickHand, numbers[i]);
            result.append(clickHand);
        }

        return result.toString();
    }

    private String getClickHand(int number, Map<String, Integer> position, String hand) {
        String result = "";

        switch (number) {
            case 1:
            case 4:
            case 7:
                result = LEFT;
                break;
            case 3:
            case 6:
            case 9:
                result = RIGHT;
                break;
            default:
                result = getNearestPositionFrom(number, position, hand);
                break;
        }

        return result;
    }

    private String getNearestPositionFrom(int number, Map<String, Integer> position, String hand) {

        String result = hand;

        int left = position.get("L");
        int right = position.get("R");

        if (left == -1 && right == -1) {
            return result;
        }

        int distanceFromLeft = 0;
        int distanceFromRight = 0;

        int leftNumber = number - 1;
        int rightNumber = number + 1;


        if (distanceFromLeft == distanceFromRight) {
            return result;
        }

        return result;
    }
}