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
    public int kthSmallest(TreeNode root, int k) {
       Stack<TreeNode>stck=new Stack<>();
       while(root!=null)
       {
           stck.push(root);
           root=root.left;
       }   
       while(k!=0)
       {
           TreeNode q=stck.pop();
           k--;
           if(k==0) return q.val;
           TreeNode node=q.right;
           while(node!=null)
           {
               stck.push(node);
               node=node.left;
           }
       }
       return -1;
    }
}
