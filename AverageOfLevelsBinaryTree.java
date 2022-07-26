import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class AverageOfLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
           if(root==null)
               return new ArrayList<>();
           List < Double > res = new ArrayList < > ();
           Queue<TreeNode>queue=new LinkedList<>();
           List<Double>list=new ArrayList<>();
           queue.add(root);
           while(!queue.isEmpty())
           {
               long sum=0,count=0;
               Queue<TreeNode>temp=new LinkedList<>();
               while(!queue.isEmpty())
               {
                   TreeNode n=queue.remove();
                   sum+=n.val;
                   count++;
                   if(n.left!=null)
                       temp.add(n.left);
                   if(n.right!=null)
                       temp.add(n.right);
               }
               queue=temp;
               res.add(sum*1.0/count);
           }
           return res;

        }
        //Evaluate Tree
    public static boolean evaluateTree(TreeNode root) {
        if(root.val==0||root.val==1)
            return root.val==1;
        return helper(root);
    }
    public static boolean helper(TreeNode root)
    {
        if(root.val==2)
            return helper(root.left)||helper(root.right);
        if(root.val==3)
            return helper(root.left)&&helper(root.right);
        return root.val==1;

    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)
            return null;
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        TreeNode new_node=new TreeNode(root1.val+root2.val);
        new_node.left=mergeTrees(root1.left,root2.left);
        new_node.right=mergeTrees(root1.right,root2.right);
        return new_node;
    }
    public static void main(String args[])
      {

      }
}
