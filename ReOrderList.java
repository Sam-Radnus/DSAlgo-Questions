/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode start=head;
        ListNode prev=null,slow=head,fast=head;
        if( head==null || head.next==null) return ;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        prev.next=null;
        Stack<ListNode>stck=new Stack<>();
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=null;
            stck.push(curr);
            curr=temp;
        }
        while(!stck.isEmpty())
        {
            ListNode temp=stck.pop();
            if(head==null)
            {
               head=temp;
               head=temp.next;
              // System.out.println(head.val);
            }
            else{
                ListNode currNext=head.next;
                head.next=temp;
                temp.next=currNext;
                head=temp.next;
                if(head==null && !stck.isEmpty())
                {
                    temp.next=stck.pop();
                }
            }
        }
        
    }
}
