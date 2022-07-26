import java.util.*;
public class TopViewBinaryTree {
    public static void topView(Node node)
    {
        if(node==null)
            return ;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            int height=temp.height;
            if(!map.containsKey(height))
                map.put(temp.height,temp.key);
            if(temp.left!=null)
            {
                temp.left.height=(temp.height)-1;
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                temp.right.height=(temp.height)+1;
                q.add(temp.right);
            }
        }
        System.out.println(map.values());
    }
    public static void main(String args[])
    {
        Node node=new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.right = new Node(4);
        node.left.left = new Node(5);
        node.left.right.left.left = new Node(10);
        node.left.right.right = new Node(11);
        node.right.right = new Node(9);
        topView(node);
    }
}
