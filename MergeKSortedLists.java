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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode>list=new ArrayList<>();
        for(ListNode l:lists)
        {
            if(l!=null) list.add(l); 
        }
        return merge(list,0);
    }
    public ListNode merge(ArrayList<ListNode>list,int i)
    {
        if(list.size()==0) return null;
        if(i==list.size()-1) return list.get(i);
        
        ListNode l1=list.get(i);
        ListNode l2=merge(list,i+1);
        ListNode dummy=new ListNode(0);
        ListNode node=null;
        ListNode tail=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                node=new ListNode(l1.val);
                tail.next=node;
                tail=tail.next;
                l1=l1.next;
            }
            else{
                node=new ListNode(l2.val);
                tail.next=node;
                tail=tail.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            node=new ListNode(l1.val);
            tail.next=node;
            tail=tail.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            node=new ListNode(l2.val);
            tail.next=node;
            tail=tail.next;
            l2=l2.next;
        }
        return dummy.next;
    }
}
