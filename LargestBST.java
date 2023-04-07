class NodeSet{
        public int size;
        public int max;
        public int min;
        NodeSet(int size,int min,int max){
            this.size=size;
            this.max=max;
            this.min=min;
        }
}
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    
    static NodeSet isBST(Node root){
          if(root==null) return new NodeSet(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
          
          NodeSet left=isBST(root.left);
          NodeSet right=isBST(root.right);
          
          if(left.max < root.data && root.data < right.min) 
             return new NodeSet((left.size+right.size+1),Math.min(root.data,left.min),Math.max(root.data,right.max));
         
          return new NodeSet(Math.max(left.size,right.size),Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    static int largestBst(Node root)
    {
        // Write your code here
        return isBST(root).size;
        
    }
    
}
