public class LinkedList {
       public void LinkedListReversal(ListNode root)
       {
           ListNode head=null;
           ListNode mid=root;
           ListNode tail=mid.next;
           while(tail!=null) {
               mid.next = head;
               head = mid;
               mid = tail;
               tail = tail.next;
           }
       }

}
