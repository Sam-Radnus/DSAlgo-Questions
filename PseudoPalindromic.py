class Solution:
    def dfs(self,root,p):
        if root==None:
            return
        p^=(1<<root.val)
        if root.left==None and root.right==None:
            if p.bit_count()<=1:
               self.count+=1
               return 
        self.dfs(root.left,p)
        self.dfs(root.right,p)
            
    def pseudoPalindromicPaths (self, root: Optional[TreeNode]) -> int:
        self.count=0
        self.dfs(root,0)
        return self.count
