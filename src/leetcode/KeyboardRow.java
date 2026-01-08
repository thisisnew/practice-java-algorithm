package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class KeyboardRow {

    private static final Set<Character> FIRST_ROW_SET = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    private static final Set<Character> SECOND_ROW_SET = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    private static final Set<Character> THIRD_ROW_SET = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.toString(findWords(new String[]{br.readLine()})));
    }

    private static String[] findWords(String[] words) {
        var result = new ArrayList<String>();

        for (String word : words) {

            if (Objects.isNull(word) || word.isBlank()) {
                continue;
            }

            var chars = word.toCharArray();
            var fCnt = 0;
            var sCnt = 0;
            var tCnt = 0;
            var isSameRow = true;
            for (var c : chars) {
                if (FIRST_ROW_SET.contains(c)) {
                    fCnt++;
                    if (sCnt > 0 || tCnt > 0) {
                        isSameRow = false;
                        break;
                    }
                }

                if (SECOND_ROW_SET.contains(c)) {
                    sCnt++;
                    if (fCnt > 0 || tCnt > 0) {
                        isSameRow = false;
                        break;
                    }
                }

                if (THIRD_ROW_SET.contains(c)) {
                    tCnt++;
                    if (fCnt > 0 || sCnt > 0) {
                        isSameRow = false;
                        break;
                    }
                }
            }

            if (isSameRow) {
                result.add(word);
            }
        }

        return new String[]{};
    }
}
