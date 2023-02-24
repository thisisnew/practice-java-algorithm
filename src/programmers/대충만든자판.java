package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 대충만든자판 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(Arrays.toString(keyboard.solution(keymap, targets)));
    }
}

class Keyboard {

    private static final int NOT_FOUND = -1;

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
            int cnt = NOT_FOUND;

            for (String key : keymap) {
                int c = findIndexTokenCharInKey(token, key);

                if (c == NOT_FOUND) {
                    continue;
                }

                if (cnt == NOT_FOUND && c > cnt) {
                    cnt = c;
                    continue;
                }

                if (cnt != NOT_FOUND && c < cnt) {
                    cnt = c;
                }
            }

            if (!hasNotFound(cnt)) {
                result += cnt;
            }
        }

        if (hasNotFound(result)) {
            result = NOT_FOUND;
        }

        return result;
    }

    private int findIndexTokenCharInKey(String token, String key) {
        int result = NOT_FOUND;

        for (int i = 0; i < key.length(); i++) {
            if (token.equals(String.valueOf(key.charAt(i)))) {
                result = i + 1;
                break;
            }
        }

        return result;
    }

    private boolean hasNotFound(int v) {
        if (v <= 0) {
            return true;
        }

        return false;
    }
}