public class SortedArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int nums[]){
        helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int nums[],int left,int right)
    {
        if(left>right)
            return null;
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(nums[mid]);
        TreeNode lft=helper(nums,left,mid-1);
        TreeNode rgt=helper(nums,mid+1,right);
        node.left=lft;
        node.right=rgt;
        return node;
    }
        
}
