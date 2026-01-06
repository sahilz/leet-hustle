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
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int res = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for(int level = 1; !q.isEmpty(); ++level) {
            int sum = 0;
            for(int len = q.size(); len > 0; --len) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
                sum += curr.val;
            }
            if(sum > maxSum) {
                maxSum = sum;
                res = level;
            }
        }
        return res;
    }
}