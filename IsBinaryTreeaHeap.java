class Solution {
    boolean mode;
    boolean isHeap(Node tree) {
        // code 
        if(tree==null) return true;
        Queue<Node>q=new LinkedList<>();
        boolean flag=false;
        q.add(tree);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp.left!=null)
            { 
               if(flag==true||temp.left.data>temp.data) return false;
               q.add(temp.left);
            }
            else flag=true;
            if(temp.right!=null)
            { 
               if(flag==true||temp.right.data>temp.data) return false;
               q.add(temp.right);
            }
            else flag=true;
        }
        return true;
    }
}
