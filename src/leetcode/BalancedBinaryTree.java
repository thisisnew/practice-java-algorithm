package leetcode;

import java.io.IOException;

public class BalancedBinaryTree {

    public static void main(String[] args) throws IOException {
        System.out.println(isBalanced(new TreeNode()));
    }

    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        var left = height(root.left);
        var right = height(root.right);

        if (Math.abs(left - right) > 1) {
            return false;
        }

        return  isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    private static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) {
         this.val = val;
     }
     TreeNode(int val,
              TreeNode left,
              TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }
}
