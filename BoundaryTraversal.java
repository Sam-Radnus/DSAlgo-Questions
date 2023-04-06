class Solution
{
    ArrayList<Integer>res;
    void handleLeft(Node node){
        if(node==null) return;
        while(node!=null){
            if(node.left==null && node.right==null) break ;
            else res.add(node.data); 

            if(node.left!=null) node=node.left;
            else node=node.right;
            
        }
    }
    void leafNodes(Node node)
    {
        if(node==null) return ;
        if(node.left==null && node.right==null) res.add(node.data);
        leafNodes(node.left);
        leafNodes(node.right);
    }
    void handleRight(Node node){
        if(node==null) return;
        Stack<Integer>stck=new Stack<>();
        while(node!=null){
            if(node.left==null && node.right==null) break;
            else stck.push(node.data); 
            
            if(node.right!=null) node=node.right;
            else node=node.left;
        }
        while(!stck.isEmpty()) res.add(stck.pop());
    }
	ArrayList <Integer> boundary(Node node)
	{
	    if(node==null) return res;
	    res=new ArrayList<>();
	    res.add(node.data);
	    if(node.left==null && node.right==null) return res;
	    handleLeft(node.left);
	    leafNodes(node);
	    handleRight(node.right);
	    return res;
	}
}
