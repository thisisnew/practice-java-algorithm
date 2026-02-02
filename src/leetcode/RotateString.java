package leetcode;

import java.io.IOException;
import java.util.LinkedList;

public class RotateString {
    public static void main(String[] args) throws IOException {
        System.out.println(rotateString("",""));
    }

    private static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;

        var queue = new LinkedList<>();

        for (var c : s.toCharArray()) {
            queue.add(c);
        }

        for (var i = 0; i < queue.size(); i++) {



        }

        return true;
    }
}
