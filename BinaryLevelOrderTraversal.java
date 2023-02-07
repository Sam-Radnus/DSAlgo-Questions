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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)  return res;
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>init=new ArrayList<>();
        init.add(root.val);
        res.add(new ArrayList<>(init));
        if(root.left!=null)
           q.add(root.left);
        if(root.right!=null)
           q.add(root.right);
        while(!q.isEmpty())
        {
           Queue<TreeNode>temp=new LinkedList<>();
           List<Integer>ans=new ArrayList<>();
           while(!q.isEmpty())
           {
               TreeNode x=q.poll();
               ans.add(x.val);
               if(x.left!=null)
                 temp.add(x.left);
               if(x.right!=null)
                  temp.add(x.right);    
           }
           if(q.isEmpty())
              res.add(new ArrayList<>(ans));
           while(!temp.isEmpty())
           {
               TreeNode node=temp.poll();
               q.add(node);
           }   
        }      
        return res; 
    }
}
