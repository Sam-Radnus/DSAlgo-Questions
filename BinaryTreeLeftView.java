import java.util.*;
public class BinaryTreeLeftView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return new ArrayList<>();

        List<Integer>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int lvlWidth=q.size();
            for(int i=0;i<lvlWidth;i++)
            {
                TreeNode node=q.poll();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                if(i==lvlWidth-1)res.add(node.val);
            }
        }
        return res;
    }
}
}
