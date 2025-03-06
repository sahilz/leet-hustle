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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        TreeNode curr = root;
        while(curr != null) {
            if(curr.val == val) {
                res = curr;
                break;
            } else if (curr.val > val) {
                if(curr.left != null)
                curr = curr.left;
                else curr = null;
            } else if (curr.val < val) {
                if(curr.right != null)
                curr = curr.right;
                else 
                curr = null;
            }
        }
        return res;
    }
}