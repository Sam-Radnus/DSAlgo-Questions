
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
       Node node=new Node(0);
       Node dummy=null;
       Node tail=null;
       Node p=head1,q=head2;
       while(p!=null && q!=null)
       {
           if(p.data==q.data)
           {
               if(node==null)
               {
                   node=new Node(p.data);
               }
               else node.data=p.data;
               if(dummy==null)
               {
                   dummy=node;
                   tail=dummy;
               }
               else {
                   tail.next=node;
                   tail=node;
               }
               node=node.next;
               p=p.next;
               q=q.next;
           }
           else if(p.data<q.data)
           {
               p=p.next;
           }
           else {
               q=q.next;
           }
       }
       return dummy;
    }
}
