class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer>res=new ArrayList<>();
	    boolean zig=true;
	    Queue<Node>q=new LinkedList<>();
	    if(root==null) return res;
	    q.add(root);
	    while(!q.isEmpty()){
	        List<Node>temp=new ArrayList<>();
	        int size=q.size();
	        for(int i=0;i<size;i++){
	            Node node=q.poll();
	            if(node!=null){
	              res.add(node.data);
	              if(zig){
	                  temp.add(node.left);
	                  temp.add(node.right);
	              }
	              else {
	                  temp.add(node.right);
	                  temp.add(node.left);
	              }
	            }
	        }
	        zig=!zig;
	        for(int i=temp.size()-1;i>=0;i--){
	            q.add(temp.get(i));
	        }
	    }
	    return res;
	}
