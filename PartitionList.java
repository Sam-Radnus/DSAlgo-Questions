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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode small=null;
        ListNode big=null;
        ListNode start=null,sptr=new ListNode(0),bptr=new ListNode(0),bs=null;
        while(head!=null){
            if(head.val<x){
                small=new ListNode(head.val);
                if(start==null){ 
                    start=sptr;    
                }
                sptr.next=small;
                sptr=sptr.next;  
            }
            else{
                big=new ListNode(head.val);
                if(bs==null) bs=bptr;
                bptr.next=big;
                bptr=bptr.next;
            }
            head=head.next;
        }
        if(sptr!=null && bs!=null)
           sptr.next=bs.next;
        return start!=null?start.next:bs.next;
    }
}
