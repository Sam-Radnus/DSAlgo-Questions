public class ConstructBSTfromLL {
    public TreeNode sortedListToBST(ListNode head) {
           if(head==null)return null;
           return helper(head,null);
    }
    public TreeNode helper(ListNode head,ListNode tail)
    {
        if(head==tail)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=tail&&fast.next!=tail)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode node=new TreeNode(slow.val);
        node.left=helper(head,slow);
        node.right=helper(slow.next,tail);
        return node;
    }
}
