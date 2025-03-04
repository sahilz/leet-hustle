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
        helper(root, new StringBuilder(), res);
        return res;
    }

    private void helper(TreeNode node, StringBuilder sb, List<String> res) {
        // base case
        if(node == null) return;
        int len = sb.length();
        // add current node to path
        sb.append(node.val);
        //check if leaf node and add path to result
        // else call recursion
        if(isLeaf(node)) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            helper(node.left, sb, res);
            helper(node.right, sb, res);
        }
        sb.setLength(len);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}