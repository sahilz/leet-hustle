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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(root, "", res);
        return res;
    }

    private void helper(TreeNode node, String path, List<String> res) {
        // base case
        if(node == null) return;
        // add current node to path
        path += node.val;
        //check if leaf node and add path to result
        // else call recursion
        if(isLeaf(node)) {
            res.add(path);
        } else {
            path += "->";
            helper(node.left, path, res);
            helper(node.right, path, res);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}