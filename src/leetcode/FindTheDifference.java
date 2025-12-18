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



    }

    private static Set<Character> set(char[] chars) {

        var set = new HashSet<Character>();

        for (char aChar : chars) {
            set.add(aChar);
        }

        return set;
    }
}
