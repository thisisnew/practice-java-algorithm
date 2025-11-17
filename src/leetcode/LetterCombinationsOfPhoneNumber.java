package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

    private static final Map<Character, List<String>> CHARACTER_LIST_MAP = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z")
    );

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(letterCombinations(br.readLine()));
    }

    private static List<String> letterCombinations(String digits) {

        List<List<String>> charList = new ArrayList<>();

        for (var c : digits.toCharArray()) {
            charList.add(CHARACTER_LIST_MAP.get(c));
        }

        if (charList.isEmpty()) {
            return new ArrayList<>();
        }

        var result = new ArrayList<String>();

        for (var i = 0; i < charList.get(0).size(); i++) {
            var list = new ArrayList<String>();
            var first = charList.get(0).get(i);
            list.add(first);

            var idx = i+1;
            while(idx < charList.size()) {
                var chars = charList.get(idx);

                for (var c : chars) {
                    list.remove(first);
                    list.add(first + c);
                }

                idx++;
            }

            result.addAll(list);
        }

        return result;
    }
}
