public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root,int val){
        if(root==null)
        {
            TreeNode node=new TreeNode(val);
            return node;
        }
        helper(root,val);
        return root;
    }
    public TreeNode helper(TreeNode root,int val)
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if (val > root.val) {
            root.right=insertIntoBST(root.right, val);
        } else {
            root.left=insertIntoBST(root.left, val);
        }
        return root;
    }
    public static void main(String args[])
    {

    }
}
