/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    class tuples{
    TreeNode t;
    int row;
    int col;
    tuples(TreeNode t,int row,int col){
        this.t=t;
        this.row=row;
        this.col=col;
    }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<tuples>q=new LinkedList<>();
        q.add(new tuples(root,0,0));
        while(!q.isEmpty()){
            tuples node=q.poll();
            TreeNode temp=node.t;
            int row=node.row;
            int col=node.col;
            if(!map.containsKey(row)) map.put(row,new TreeMap<>());
            if(!map.get(row).containsKey(col)) map.get(row).put(col,new PriorityQueue<>());
            map.get(row).get(col).offer(temp.val);
            if(temp.left!=null) q.add(new tuples(temp.left,row-1,col+1));
            if(temp.right!=null) q.add(new tuples(temp.right,row+1,col+1));
        }
        List<List<Integer>>list=new ArrayList<>();
        for( TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer>ws:ys.values()){
                while(!ws.isEmpty()){
                    list.get(list.size()-1).add(ws.poll());
                }
            }
        }
        return list;
    }
}
