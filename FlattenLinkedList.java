class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	   if(root==null||root.next==null) return root;
	   Node res=new Node(root.data);
	   Node start=res;
	   Node right=flatten(root.next);
	   Node bottom=root.bottom;
	   Node node=null;
	   while(right!=null && bottom!=null){
	       if(right.data<bottom.data)
	       {
	          node=new Node(right.data);
	          res.bottom=node;
	          res=res.bottom;
	          right=right.bottom;
	       }
	       else{
	           node=new Node(bottom.data);
	           res.bottom=node;
	           res=res.bottom; 
	           bottom=bottom.bottom;
	       }
	   }
	   while(right!=null)
	   {
	           node=new Node(right.data);
	           res.bottom=node;
	           res=res.bottom; 
	           right=right.bottom;
	   }
	   while(bottom!=null)
	   {
	           node=new Node(bottom.data);
	           res.bottom=node;
	           res=res.bottom; 
	           bottom=bottom.bottom;
	   }
	   return start;
    }
}
