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
    public static void main(String args[])
      {

      }
}
