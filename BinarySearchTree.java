import java.util.*;
public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;
    }
    public static Node getNode(int data)
    {
        Node node=new Node();
        node.data=data;
        node.left=node.right=null;
        return node;
    }

    //function to construct a BST from its level order traversal
    public static Node LevelOrder(Node root,int data)
    {
        if(root==null){
            Node child=getNode(data);
            return child;
        }

        if(root.data>data)
        {
            root.left=LevelOrder(root.left,data);
        }
        else{
            root.right=LevelOrder(root.right,data);
        }
        return root;
    }
    public static Node constructBST(int arr[],int n){
        //n denotes the number of nodes in that particular level
        if(n==0)
        {
            return null;
        }
        Node node=null;
        for(int i=0;i<n;i++)
        {
            node=LevelOrder(node,arr[i]);
        }
       return node;
    }
    public static void inorderTraversal(Node root)
    {
        if(root==null) return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
          List<Integer>vals=new ArrayList<>();
          inorder(root,vals);
          TreeNode ans=new TreeNode(0),cur=ans;
          for(int v:vals)
          {
              cur.right=new TreeNode(v);
              cur=cur.right;
          }
          return ans.right;
    }
    public void inorder(TreeNode node,List<Integer>vals)
    {
        if(node==null)
            return;

        inorder(node.left,vals);
        inorder(node.right,vals);
        vals.add(node.val);
    }
    public static void main(String args[])
    {
        int arr[]={-10,-3,0,9,6};
        Node root=constructBST(arr,arr.length);
        System.out.print("InorderTraversal"+":");
        inorderTraversal(root);
    }
}
