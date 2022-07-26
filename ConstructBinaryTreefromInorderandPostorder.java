import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderandPostorder {
    int postOrderIndex;
    Map<Integer,Integer> inOrderIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrderIndex=new HashMap<>();
        postOrderIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
        {
            inOrderIndex.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode helper(int inorder[],int []postorder,int left,int right)
    {
        if(left>right) return null;
        int rootValue=postorder[postOrderIndex--];
        TreeNode node=new TreeNode(rootValue);

        node.right=helper(inorder,postorder,inOrderIndex.get(rootValue)+1,right);
        node.left=helper(inorder,postorder,left,inOrderIndex.get(rootValue)-1);
        return node;
    }
    public static void main(String args[])
    {

    }
}
