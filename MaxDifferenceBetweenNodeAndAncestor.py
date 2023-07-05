# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
       
        def maxAncestor(root:Optional[TreeNode]):
            nonlocal max_diff
            if root==None:
                return None
            mat=[0,float('inf')]
            left=maxAncestor(root.left)
            right=maxAncestor(root.right)
            left_min,left_max,right_min,right_max=float('inf'),root.val,float('inf'),root.val
            if not(left==None):
                left_min=min(left_min,left[0])
                left_max=max(left_max,left[1])

            if not(right==None):
                right_min=min(right_min,right[0])
                right_max=max(right_max,right[1])
            
            mat[0]=min(left_min,min(right_min,root.val))
            mat[1]=max(left_max,max(right_max,root.val))
            
            max_diff=max(max_diff,max(abs(root.val-mat[0]),abs(root.val-mat[1])))
          
            return mat
        max_diff=0
        maxAncestor(root)
        return max_diff
            

            
           
        
