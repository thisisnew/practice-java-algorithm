package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FindTheDifference {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        var a = br.readLine();
        var b = br.readLine();
        System.out.println(findTheDifference(a, b));
    }

    private static char findTheDifference(String s, String t) {
        Set<Character> sSet = createSet(s.toCharArray());
        Set<Character> tSet = createSet(t.toCharArray());

        for (char c : tSet) {
            if (!sSet.contains(c)) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }

    private static Set<Character> createSet(char[] chars) {

        var set = new HashSet<Character>();

        for (char aChar : chars) {
            set.add(aChar);
        }

        return set;
    }
}
