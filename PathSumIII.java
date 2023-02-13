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
    Map<Long,Integer>map=new HashMap<>();
    long prefixSum=0;
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        helper(root,targetSum);
        return count;
    }
    public void helper(TreeNode root,int targetSum)
    {
        if(root==null) return;
        prefixSum+=root.val;
        if(prefixSum==targetSum)
            count++;
        count+=map.getOrDefault(prefixSum-targetSum,0);
        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        helper(root.left,targetSum);
        helper(root.right,targetSum);
        map.put(prefixSum,map.get(prefixSum)-1);
        prefixSum-=root.val;
    }
}
