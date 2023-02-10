/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode start=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
            if(head==fast){
                head=start;
                while(head!=fast)
                {
                    head=head.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;

    }
}
