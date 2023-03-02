class Solution
{
    Node compute(Node head)
    {
        // your code here
        if(head==null) return head;
        while(head.next!=null && head.data<head.next.data)
            head=head.next;
        if(head.next==null) return head;
        Node next=compute(head.next);
        if(head.data>=next.data) head.next=next;
        else head=next;
        return head;
    }
}
  
