/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        // Base case
        if(root == null) return 0;
        int leftSide = minDepth(root.left);
        int rightSide = minDepth(root.right);
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return rightSide + 1;
        if(root.right == null) return leftSide + 1;
        return Math.min(leftSide, rightSide) + 1;
    }
} 