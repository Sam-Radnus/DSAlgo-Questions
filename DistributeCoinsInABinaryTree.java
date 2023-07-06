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
    int moves=0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int cl=helper(root.left);
        int cr=helper(root.right);
        int c=cl+cr;
        c+=root.val-1;
        root.val-=1;
        moves+=Math.abs(c);
        return c;
    }
    public int distributeCoins(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return moves;
        
    }
}
