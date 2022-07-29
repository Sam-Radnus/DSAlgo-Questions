public class SearchInBinarySearchTree {
    TreeNode node=null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.val==val){
            node=root;
            return root;
        }
        if(root.val>val)
            searchBST(root.left,val);
        else
            searchBST(root.right,val);
        return node;
    }
}
