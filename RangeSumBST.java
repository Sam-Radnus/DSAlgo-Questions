public class RangeSumBST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high){
        helper(root,low,high);
        return sum;
    }
    public void helper(TreeNode node,int low,int high)
    {
        if(node==null)return;
        if(low<=node.val&&node.val<=high)
            sum+=node.val;
        if(low<node.val)
            helper(node.left,low,high);
        if(high>node.val)
            helper(node.right,low,high);
    }

    public static void main(String args[])
    {

    }
}
