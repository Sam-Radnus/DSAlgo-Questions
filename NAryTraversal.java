import java.util.*;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class NAryTraversal {
    List<Integer>res;
    //RECURSION AND ITERATIVE
    public List<Integer> postorder(Node root) {
        if(root==null)
            return new ArrayList<>();
        res=new ArrayList<>();
        helper(root);
        return res ;
    }
    public void helper(Node root)
    {
        for(int i=0;i<root.children.size();i++)
            helper(root.children.get(i));
        res.add(root.val);
    }
    //USING ITERATION
    public List<Integer> preorder(Node root) {
        if(root==null) return new ArrayList<>();
        res.add(root.val);
        for(int i=0;i<root.children.size();i++)
            preorder(root.children.get(i));
        return res;
    }
    //USING STACK
    public List<Integer> preorderStack(Node root) {
        Stack<Node>stk=new Stack<Node>();
        List<Integer>res=new ArrayList<>();
        stk.push(root);
        while(!stk.isEmpty())
        {
            Node node=stk.pop();
            if(node!=null)
            {
                res.add(node.val);
                int childrens=node.children.size()-1;
                while(childrens>=0)
                {
                    stk.push(node.children.get(childrens--));

                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {

    }
}
