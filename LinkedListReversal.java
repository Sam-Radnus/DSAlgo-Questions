class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class LinkedListReversal {

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next_node=head.next;
            head.next=prev;
            prev=head;
            head=next_node;
        }
        return prev;
    }
    public static void main(String args[])
    {

    }
}
