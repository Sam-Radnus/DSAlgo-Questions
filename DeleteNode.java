public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(root.val==key)
            root=delete(root,key);
        else if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else{
            root.left=deleteNode(root.left,key);
        }
        return root;
    }
    public TreeNode delete(TreeNode root,int key)
    {
        if(root.left==null && root.right==null)
            return null;
        if(root.right==null)
            return root.left;
        if(root.left==null)
            return root.right;


        TreeNode helper=root.right;
        //smallest element in the left sub tree
        while(helper.left!=null)
        {
            helper=helper.left;
        }
        helper.left=root.left;
        return root.right;
    }
}
