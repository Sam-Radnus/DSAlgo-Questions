import java.util.HashMap;
import java.util.Map;

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
    int preOrderIndex;
    Map<Integer,Integer> inorderIndexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrderIndex=0;
        inorderIndexMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inorderIndexMap.put(inorder[i],i);
        return helper(preorder,0,preorder.length-1);
    }
    public TreeNode helper(int [] preorder,int left,int right)
    {
        if(left>right)
            return null;
        int rootValue=preorder[preOrderIndex++];
        TreeNode node=new TreeNode(rootValue);
        node.left=helper(preorder,left,inorderIndexMap.get(rootValue)-1);//left partition
        node.right=helper(preorder,inorderIndexMap.get(rootValue)+1,right);//right partition
        return node;
    }
}