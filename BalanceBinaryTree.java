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
    List<Integer>nodes;
    public TreeNode balanceBST(TreeNode root) {
        nodes=new ArrayList<>();
        inOrderTraversal(root);
        System.out.println(nodes);
        TreeNode res=balanceBST2(0,nodes.size()-1);
        return res;
    }
    public TreeNode balanceBST2(int start,int end)
    {
       if(start < 0 || end < 0 || start >end || end >=nodes.size())
       {
           return null;
       } 
       int mid=start+(end-start)/2;
       TreeNode midEl=new TreeNode(nodes.get(mid));
       midEl.left=balanceBST2(start,mid-1);
       midEl.right=balanceBST2(mid+1,end);
       return midEl;
    }
    public void inOrderTraversal(TreeNode root)
    {
        if(root==null) return ;
        inOrderTraversal(root.left);
        nodes.add(root.val);
        inOrderTraversal(root.right);
    }

}
