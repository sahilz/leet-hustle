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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, targetSum, new ArrayList<Integer>(), res);
        return res;
    }

    private void helper(TreeNode node, int sum, List<Integer> temp, List<List<Integer>> res) {
        // base case
        if(node == null) return;
        temp.add(node.val);
        if(isLeaf(node) && node.val == sum) {
            res.add(new ArrayList<>(temp));
        } else {
            helper(node.left, sum - node.val, temp, res);
            helper(node.right, sum - node.val, temp, res);
        }
        temp.remove(temp.size() - 1);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}