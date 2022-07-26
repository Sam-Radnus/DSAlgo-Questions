class Node{
   int key,height;
   Node left,right;
   Node(int item)
   {
       key=item;
       left=right=null;
       height=0;
   }
}
public class BinaryTree {
    Node root;
    BinaryTree()
    {
        root=null;
    }
    void printPostOrder(Node node)
    {
       if(node==null)
           return;
       printPostOrder(node.left);
       printPostOrder(node.right);
       System.out.print(node.key+" ");
    }
    void printInOrder(Node node){
       if(node==null)
           return;
       printInOrder(node.left);
       System.out.print(node.key+" ");
       printInOrder(node.right);
    }
    void printPreOrder(Node node)
    {
        if(node==null)
            return;
        System.out.print(node.key+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    void printPreOrder(){ printPreOrder(root);}
    void printInOrder(){ printInOrder(root);}
    void printPostOrder(){ printPostOrder(root);}
    public static void main(String args[])
    {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        System.out.println("\n Pre Order Traversal");
        tree.printPreOrder();
        System.out.println("\n In Order Traversal");
        tree.printInOrder();
        System.out.println("\n post Order Traversal");
        tree.printPostOrder();
    }

}

