public class RemoveNthNodeFromTheEnd {
    ListNode start=new ListNode(0);
    ListNode slow=start,fast=start;
    fast.next=head;
        for(int i=0;i<n+1;i++)
    {
        fast=fast.next;
    }
        while(fast!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    // you arrive at a situation where there are n nodes between slow and fast and this point the next node to slow
    // is the one that needs to be removed
    slow.next=slow.next.next;
        return start.next;
}
