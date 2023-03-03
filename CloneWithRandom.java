class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        Node dummy=new Node(0);
        Node newHead=head;
        Node ptr=head;
        Node start=head;
        Node tail=dummy;
        Node node=null;
        while(head!=null)
        {
            Node temp=head.next;
            node=new Node(head.data);
            head.next=node;
            node.next=temp;
            head=temp;
        }
        
        while(ptr!=null)
        {
            if(ptr.arb!=null)
               ptr.next.arb=ptr.arb.next;
            else 
               ptr.next.arb=null;
            ptr=ptr.next.next;
        }
        Node first=newHead;
        Node second=first.next;
        Node third=second;
        dummy.next=second;
        while(first!=null)
        {
           first.next=first.next.next;
           if(second.next!=null){
               second.next=second.next.next;
               second=second.next;
           }
           first=first.next;
        }
        return dummy.next;
    }
}
