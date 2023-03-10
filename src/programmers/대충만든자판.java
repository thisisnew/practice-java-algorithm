package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 대충만든자판 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA", "BGZ"};

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
            int cnt = getCnt(keymap, token);

            if (hasNotFound(cnt)) {
                continue;
            }

            result += cnt;
        }

        return hasNotFound(result) ? NOT_FOUND : result;
    }

    private int getCnt(String[] keymap, String token) {
        int cnt = NOT_FOUND;

        for (String key : keymap) {
            int idx = findIndexTokenCharInKey(token, key);

            if (idx == NOT_FOUND) {
                continue;
            }

            if ((cnt == NOT_FOUND && idx > cnt) || (cnt != NOT_FOUND && idx < cnt)) {
                cnt = idx;
            }
        }

        return cnt;
    }

    private int findIndexTokenCharInKey(String token, String key) {
        for (int i = 0; i < key.length(); i++) {
            if (token.equals(String.valueOf(key.charAt(i)))) {
                return i + 1;
            }
        }

        return NOT_FOUND;
    }

    private boolean hasNotFound(int v) {
        if (v <= 0) {
            return true;
        }

        return false;
    }
}