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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode even=head;
        ListNode odd=head.next;
        ListNode oddHead=odd;
        while(odd!=null && odd.next!=null)
        {
            even.next=even.next.next;
            odd.next=odd.next.next;
            even=even.next;
            odd=odd.next;    
        }
        even.next=oddHead;
        return head;
    }
}
