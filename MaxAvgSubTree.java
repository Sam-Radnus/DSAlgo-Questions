/************************************************
    Binary Tree Node class for reference

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = right = null;
        }

    }
 **********************************************/

public class Solution {
    
    static double maxAvg;
    public static double maxSubtreeAverage(TreeNode<Integer> root) {
        // Write your code here.
        maxAvg = Double.MIN_VALUE - 1e9;
        helper(root);
        return maxAvg;
    }
    public static int[] helper(TreeNode<Integer> root)
    {
       if(root==null)
           return new int[]{0,0};
        int left[]=helper(root.left);
        int right[]=helper(root.right);
        int currSum=left[0]+right[0]+root.data;
        int currNodes=left[1]+right[1]+1;
        maxAvg=Math.max(maxAvg,(currSum/(double)currNodes));
        return new int[]{currSum,currNodes};
    }
    
}






