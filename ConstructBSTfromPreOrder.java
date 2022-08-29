public class ConstructBSTfromPreOrder {
    class Solution {
        int i=0;
        public TreeNode bstFromPreorder(int nums[])
        {
            return helper(nums,Integer.MAX_VALUE);
        }
        public TreeNode helper(int nums[],int bound)
        {
            if(i==nums.length||nums[i]>bound)
                return null;
            TreeNode node=new TreeNode(nums[i++]);
            node.left=helper(nums,node.val);
            node.right=helper(nums,bound);
            return node;
        }
    }
}
