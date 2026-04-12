package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            if (num != 0) {
                queue.add(num);
            } else {
                stack.push(num);
            }
        }

        int idx = 0;
        while (!queue.isEmpty()) {
            nums[idx++] = queue.poll();
        }

        while (!stack.isEmpty()) {
            nums[idx++] = stack.pop();
        }
    }
}
