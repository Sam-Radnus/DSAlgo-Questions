import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
class Pair{
	BinaryTreeNode<Integer>root;
	int count;
	Pair(BinaryTreeNode<Integer>root,int count){
		this.root=root;
		this.count=count;
	}
}
public class Solution {
	public static void combineTraversal(List<Integer>pre,List<Integer>in,List<Integer>post,BinaryTreeNode<Integer>root){
	       Pair p=new Pair(root,1);
		   Stack<Pair>stck=new Stack<>();
		   stck.push(p);
		   while(!stck.isEmpty()){
			    p=stck.pop();
				if(p.count==1){
					if(p.root!=null) pre.add(p.root.data);
					p.count++;
					stck.push(p);
					if(p.root!=null && p.root.left!=null) stck.push(new Pair(p.root.left, 1));
				}
				else if(p.count==2){
					if(p.root!=null) in.add(p.root.data);
					p.count++;
					stck.push(p);
					if(p.root!=null && p.root.right!=null) stck.push(new Pair(p.root.right,1));
				}
				else if(p.root!=null) post.add(p.root.data);
		   }
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer>root) {
        // Write your code here.
		List<Integer>pre=new ArrayList<>();
		List<Integer>post=new ArrayList<>();
		List<Integer>in=new ArrayList<>();
        combineTraversal(pre,in,post,root);
		List<List<Integer>>res=new ArrayList<>();
		res.add(in);
		res.add(pre);
		res.add(post);
		return res;
    }
}
