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

        return result;
    }
}