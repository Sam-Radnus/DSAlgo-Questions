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
    public static void main(String args[])
    {
        int arr[]={7,4,12,3,6,8,1,5,10};
        Node root=constructBST(arr,arr.length);
        System.out.print("InorderTraversal"+":");
        inorderTraversal(root);
    }
}
