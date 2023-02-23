package programmers;

import java.util.ArrayList;
import java.util.List;

public class 대충만든자판 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(keyboard.solution(keymap, targets));
    }
}

class Keyboard {
    public int[] solution(String[] keymap, String[] targets) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < targets.length; i++) {
            result.add(countKeyboardClick(keymap, targets[i]));
        }

        return result
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int countKeyboardClick(String[] keymap, String target) {
        int result = 0;

        for (int i = 0; i < target.length(); i++) {
            String token = String.valueOf(target.charAt(i));

            if (true) { /// token ==
                result += 0; //카운팅값
            }

        }

        if (result == 0) {
            result = -1;
        }

        return result;
    }
}