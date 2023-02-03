package programmers;

public class 키패드누르기 {
    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(keyPad.solution(numbers, hand));
    }
}

class KeyPad {
    public String solution(int[] numbers, String hand) {

        StringBuilder result = new StringBuilder(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            result.append(getHand(numbers[i]));
        }

        return result.toString();
    }

    private String getHand(int number) {
        String result = "";

        return result;
    }
}