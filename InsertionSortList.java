 class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}
public class InsertionSortList {
    public ListNode2 insertionSortList(ListNode2 head) {
        if(head==null)
        {
            return null;
        }
        ListNode2 helper=new ListNode2(0);
        ListNode2 Next=null;
        ListNode2 cur=head;
        ListNode2 pre=helper;
        while(cur!=null)
        {
            Next=cur.next;
            while(pre.next!=null && pre.next.val < cur.val)
                pre=pre.next;
            cur.next=pre.next;
            pre.next=cur;
            pre=helper;
            cur=Next;
        }
        return helper.next;
    }
}
