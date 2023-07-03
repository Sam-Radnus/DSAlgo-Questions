# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class FindElements:
    
    def __init__(self, root: Optional[TreeNode]):
        if root==None:
            return 
        self.root=root
        self.root.val=0
        self.decontaminate(root.left,2*root.val+1)
        self.decontaminate(root.right,2*root.val+2)
        
    def decontaminate(self,root,value):
        if root==None:
            return
        root.val=value
        self.decontaminate(root.left,2*root.val+1)
        self.decontaminate(root.right,2*root.val+2)

    def find(self, target: int) -> bool:
        return self.findTarget(self.root,target)

    def findTarget(self,root,target):
        if root==None:
            return False
        if target<root.val:
            return False
        return root.val==target or self.findTarget(root.left,target) or self.findTarget(root.right,target)
        

# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)
